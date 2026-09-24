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

@Controller
public class UnitConverterController {
    private final UnitConverterService unitConverterService;

    public UnitConverterController(UnitConverterService unitConverterService) {
        this.unitConverterService = unitConverterService;
    }

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
                          // required = false -> when true, spring would send an error if the header is missing
                          @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage) {

        // conversion logic
        unitConverterService.convert(converter, model, request, userAgent, acceptLanguage);

        return "unit_converter_result";
    }
}
