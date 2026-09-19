package main.controller;

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
        model.addAttribute("unit_converter", converter);
        // conversion logic
        return "unit_converter_result";
    }
}
