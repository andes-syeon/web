package com.example.alpha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryViewController {

    @RequestMapping("/category/{category}")
    public String category(@PathVariable String category, Model model) {
        model.addAttribute("category", category);
        return "category";
    }
}
