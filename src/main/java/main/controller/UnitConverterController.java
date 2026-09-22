package main.controller;

import main.service.UnitConverterLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import main.pojo.UnitConverter;

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
        double result = UnitConverterLogic.convert(converter);
        String formatted = String.format("%.2f", result);

        model.addAttribute("unit_converter", converter);
        model.addAttribute("result", result);

        double length = converter.getLength();
        double weight = converter.getWeight();
        double temperature = converter.getTemperature();

        String unitFrom = converter.getUnitFrom();
        String unitTo = converter.getUnitTo();

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
