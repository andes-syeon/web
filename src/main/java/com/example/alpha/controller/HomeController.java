package com.example.alpha.controller;

import com.example.alpha.common.Result;
import com.example.alpha.entity.Restaurant;
import com.example.alpha.service.RestaurantService;

import java.util.List;
import java.util.Map;

import com.example.alpha.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private ReviewService reviewService;


    @RequestMapping("/home")
    public String home(Model model) {
        Result<List<Restaurant>> resultRestaurants = restaurantService.getTop4Restaurants();
        if (resultRestaurants.isSuccess()) {
            for (Restaurant restaurant : resultRestaurants.getRtnObj()) {
                System.out.println("restaurant : " + restaurant);
            }
            model.addAttribute("top4StarRestaurants", resultRestaurants.getResultObject());
        }

        Result<List<Restaurant>> resultReview = reviewService.getTop4Reviews();
        if (resultReview.isSuccess()) {
            for (Restaurant restaurant : resultReview.getRtnObj()) {
                System.out.println("restaurant : " + restaurant);
            }
            model.addAttribute("top4ReviewRestaurants", resultReview.getResultObject());
        }

        return "main";
    }
}
