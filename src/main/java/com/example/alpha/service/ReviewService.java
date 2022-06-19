package com.example.alpha.service;

import com.example.alpha.common.Result;
import com.example.alpha.common.ResultCode;
import com.example.alpha.entity.Restaurant;
import com.example.alpha.entity.Review;
import com.example.alpha.repository.ReviewRepository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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


    public Result<Map<Restaurant, Long>> getTop4Reviews() {
        try {

            List<String> temp = reviewRepository.findGroupBy();
            for (String a : temp) {
                System.out.println("a : " + a);
            }

/*
            List<Review> reviews = reviewRepository.findAll();
            Map<Restaurant, Long> map = reviews.stream().collect(Collectors.groupingBy(Review::getRestaurant, Collectors.counting()));
            return ResultCode.Success.result(map);*/
            return ResultCode.Success.result();
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }


}
