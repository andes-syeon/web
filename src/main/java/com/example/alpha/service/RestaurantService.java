package com.example.alpha.service;

import com.example.alpha.common.Result;
import com.example.alpha.common.ResultCode;
import com.example.alpha.entity.Restaurant;
import com.example.alpha.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;


    public Result<List<Restaurant>> getRestaurants() {
        try {
            List<Restaurant> restaurants = restaurantRepository.findAll();
            return ResultCode.Success.result(restaurants);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result<Restaurant> getRestaurant(Integer id) {
        try {
            Optional<Restaurant> optionalRestaurant = restaurantRepository.findById(id);
            if (optionalRestaurant.isPresent()) {
                Restaurant restaurant = optionalRestaurant.get();
                return ResultCode.Success.result(restaurant);
            }
            return ResultCode.NOT_EXISTS_RESTAURANT.result();
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }
}
