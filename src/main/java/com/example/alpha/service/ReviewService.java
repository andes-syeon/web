package com.example.alpha.service;

import com.example.alpha.common.Result;
import com.example.alpha.common.ResultCode;
import com.example.alpha.entity.Restaurant;
import com.example.alpha.entity.Review;
import com.example.alpha.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private RestaurantService restaurantService;

    public Result<List<Review>> getReviews() {
        try {
            List<Review> reviews = reviewRepository.findAll();
            return ResultCode.Success.result(reviews);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result<List<Review>> getReviewsByRestaurantId(Integer restaurantId) {
        try {
            Result restaurantResult = restaurantService.getRestaurant(restaurantId);
            if (restaurantResult.isNotSuccess()) {
                return restaurantResult;
            }
            Restaurant restaurant = (Restaurant) restaurantResult.getResultObject();
            List<Review> reviews = reviewRepository.findReviewsByRestaurantOrderByWritedttmDesc(restaurant);
            return ResultCode.Success.result(reviews);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result<List<Review>> getTop5ReviewsByRestaurantId(Integer restaurantId) {
        try {
            Result restaurantResult = restaurantService.getRestaurant(restaurantId);
            if (restaurantResult.isNotSuccess()) {
                return restaurantResult;
            }
            Restaurant restaurant = (Restaurant) restaurantResult.getResultObject();
            List<Review> reviews = reviewRepository.findTop5ByRestaurantOrderByWritedttmDesc(restaurant);
            return ResultCode.Success.result(reviews);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }


    public Result<List<Restaurant>> getTop4Reviews() {
        try {
            List<Map<String, Object>> temp = reviewRepository.findGroupBy();
            List<Restaurant> restaurants = new ArrayList<>();
            for (Map<String, Object> a : temp) {
                Integer restaurantId = (Integer) a.get("restaurant_id");
                Result<Restaurant> restaurantResult = restaurantService.getRestaurant(restaurantId);
                if (restaurantResult.isNotSuccess()) {
                    continue;
                }
                Restaurant restaurant = restaurantResult.getResultObject();
                restaurants.add(restaurant);
            }
            return ResultCode.Success.result(restaurants);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }


}
