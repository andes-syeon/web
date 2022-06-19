package com.example.alpha.controller.api;

import com.example.alpha.common.Result;
import com.example.alpha.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping("/getRestaurants")
    public Result getRestaurants() {
        return restaurantService.getRestaurants();
    }


    @RequestMapping("/restaurants/{restaurantId}")
    public Result getRestaurant(@PathVariable int restaurantId) {
        return restaurantService.getRestaurant(restaurantId);
    }

}
