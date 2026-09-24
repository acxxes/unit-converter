package main.service;

import jakarta.servlet.http.HttpServletRequest;
import main.entity.UnitConverter;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Enumeration;

@Service
public class UnitConverterService {

    public void convert(UnitConverter converter,
                          Model model,
                          HttpServletRequest request,
                          String userAgent,
                          String acceptLanguage) {

        double result = 0;
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

        model.addAttribute("unit_converter", converter);
        model.addAttribute("result", result);
        model.addAttribute("category", category);

        logConversionResult(length, weight, temperature, unitFrom, unitTo, result);
        logRequestInfo(request, userAgent, acceptLanguage);
    }

    private void logConversionResult(double length,
                                     double weight,
                                     double temperature,
                                     String unitFrom,
                                     String unitTo,
                                     double result) {

        String formatted = String.format("%.2f", result);

        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Temperature: " + temperature + "\n");
        System.out.println("From Unit: " + unitFrom);
        System.out.println("To Unit: " + unitTo);
        System.out.println("--------------");
        System.out.println(formatted + unitTo + "\n");
    }

    private void logRequestInfo(HttpServletRequest request,
                                String userAgent,
                                String acceptLanguage) {

        // INFORMATION SENT FROM THE BROWSER
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
    }
}
