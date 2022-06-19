package com.example.alpha.controller.api;

import com.example.alpha.common.Result;
import com.example.alpha.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @RequestMapping("/reviews")
    public Result getReviews(@RequestParam Map<String, String> map) {
        Integer restaurantId = Integer.valueOf(map.get("restaurantId"));
        return reviewService.getTop5ReviewsByRestaurantId(restaurantId);
    }
}
