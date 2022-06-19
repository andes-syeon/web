package com.example.alpha.controller;

import com.example.alpha.common.Result;
import com.example.alpha.entity.Restaurant;
import com.example.alpha.entity.Review;
import com.example.alpha.service.RestaurantService;
import com.example.alpha.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RestaurantViewController {


    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private ReviewService reviewService;

    //레스토랑 번호를 받는 걸로 변경해야함
    @RequestMapping("/restaurant/{restaurantId}")
    public String category(@PathVariable String restaurantId, Model model) {
        Integer restaurantIdInt = Integer.valueOf(restaurantId);
        Result<Restaurant> restaurantResult = restaurantService.getRestaurant(restaurantIdInt);
        if (restaurantResult.isSuccess()) {
            model.addAttribute("restaurant", restaurantResult.getResultObject());

            Result<List<Review>> reviewResult = reviewService.getReviewsByRestaurantId(restaurantIdInt);
            if (reviewResult.isSuccess()) {
                model.addAttribute("reviews", reviewResult.getResultObject());
            }
        }

        return "restaurant";
    }

}
