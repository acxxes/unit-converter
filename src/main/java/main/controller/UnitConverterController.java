package main.controller;

import jakarta.servlet.http.HttpServletRequest;
import main.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import main.entity.UnitConverter;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Enumeration;

@Controller
public class UnitConverterController {

    @GetMapping("/unit_converter")
    public String showForm(Model model) {
        model.addAttribute("unit_converter", new UnitConverter());
        // returns the view "unit-converter.html"
        return "unit_converter";
    }

    @PostMapping("/unit_converter")
    public String convert(@ModelAttribute UnitConverter converter,
                          Model model,
                          HttpServletRequest request,
                          @RequestHeader("User-Agent") String userAgent,
                          @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage) {

        // conversion logic
        double result = 0;
        String formatted;
        StrategyConverter strategyConverter;

        double length = converter.getLengthInput();
        double weight = converter.getWeightInput();
        double temperature = converter.getTemperatureInput();
        String category = converter.getCategory();

        String unitFrom = converter.getUnitFrom().toUpperCase();
        String unitTo = converter.getUnitTo().toUpperCase();

        System.out.println("Category received: " + category);

        switch (category) {
            case "length":
                strategyConverter = new LengthConverter();
                result = strategyConverter.convert(length, unitFrom, unitTo);
                break;
            case "weight":
                strategyConverter = new WeightConverter();
                result = strategyConverter.convert(weight, unitFrom, unitTo);
                break;
            case "temperature":
                strategyConverter = new TemperatureConverter();
                result = strategyConverter.convert(temperature, unitFrom, unitTo);
                break;
            default:
                throw new IllegalArgumentException("Invalid category type" + category);
        }

        formatted = String.format("%.2f", result);

        model.addAttribute("unit_converter", converter);
        model.addAttribute("result", result);
        model.addAttribute("category", category);

        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Temperature: " + temperature + "\n");
        System.out.println("From Unit: " + unitFrom);
        System.out.println("To Unit: " + unitTo);
        System.out.println("--------------");
        System.out.println(formatted + unitTo + "\n");

        // inspecting the request
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Request method: " + request.getMethod());
        System.out.println("Client IP address: " + request.getRemoteAddr());
        System.out.println("User-Agent header: " + userAgent);
        System.out.println("Accept-Language header: " + acceptLanguage);

        // iterate over all headers send from the browser
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            System.out.println(headerName + ": " + request.getHeader(headerName));
        }

        // iterate over all submitted form parameters (raw, before Spring binds them into `converter`)
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();
            System.out.println("Param: " + paramName + " = " + request.getParameter(paramName));
        }

        return "unit_converter_result";
    }
}
