package com.mcs.chucknorrisjokesapp.controllers;

import com.mcs.chucknorrisjokesapp.services.ChuckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChuckController {

    private final ChuckService chuckService;

    public ChuckController(ChuckService chuckService) {
        this.chuckService = chuckService;
    }

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckService.getJoke());
        return "index";
    }
}
