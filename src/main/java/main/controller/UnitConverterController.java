package main.controller;

import main.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import main.entity.UnitConverter;

@Controller
public class UnitConverterController {

    @GetMapping("/unit_converter")
    public String showForm(Model model) {
        model.addAttribute("unit_converter", new UnitConverter());
        // returns the view "unit-converter.html"
        return "unit_converter";
    }

    //TODO
    // - finish this, i dont understand it yet
    @PostMapping("/unit_converter")
    public String convert(@ModelAttribute UnitConverter converter, Model model) {
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
        System.out.println(formatted + unitTo);
        // conversion logic
        return "unit_converter_result";
    }
}
