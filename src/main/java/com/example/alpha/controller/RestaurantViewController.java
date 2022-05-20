package com.example.alpha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantViewController {


    //레스토랑 번호를 받는 걸로 변경해야함
    @RequestMapping("/restaurant/{restaurant}")
    public String category(@PathVariable String restaurant, Model model) {
        model.addAttribute("restaurant", restaurant);
        return "restaurant";
    }

}
