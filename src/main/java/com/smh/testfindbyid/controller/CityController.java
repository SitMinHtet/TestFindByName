package com.smh.testfindbyid.controller;

import com.smh.testfindbyid.model.City;
import com.smh.testfindbyid.service.CityService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Data
public class CityController {

    private final CityService cityService;

    @GetMapping("list")
    public String findAll(Model model){
        model.addAttribute("cities", cityService.findAll());
        return "cityList";
    }

    @GetMapping("/search")
    public String showEventsByName(@ModelAttribute City city, @RequestParam (value = "search", required = false) String name, Model model) {
        model.addAttribute("city", city);
        model.addAttribute("searchResult", cityService.findByCityName(name));
        return "searchList";
    }
}
