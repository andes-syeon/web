package com.example.alpha.service;

import com.example.alpha.common.Result;
import com.example.alpha.common.ResultCode;
import com.example.alpha.entity.Category;
import com.example.alpha.entity.CategoryReview;
import com.example.alpha.entity.Restaurant;
import com.example.alpha.repository.CategoryReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CategoryReviewService {

    @Autowired
    private CategoryReviewRepository categoryReviewRepository;

    @Autowired
    private CategoryService categoryService;

    public Result<List<CategoryReview>> getCategoryReviews() {
        try {
            List<CategoryReview> categoryReviews = categoryReviewRepository.findAll();
            return ResultCode.Success.result(categoryReviews);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result<CategoryReview> getCategoryReview(Integer id) {
        try {
            Optional<CategoryReview> optionalCategoryReview = categoryReviewRepository.findById(id);
            if (optionalCategoryReview.isPresent()) {
                CategoryReview categoryReview = optionalCategoryReview.get();
                return ResultCode.Success.result(categoryReview);
            }
            return ResultCode.NOT_EXISTS_RESTAURANT.result();
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result<List<CategoryReview>> getCategoryReview(String name) {
        try {
            Result categoryResult = categoryService.getCategory(name);
            if (categoryResult.isNotSuccess()) {
                return categoryResult;
            }

            Category category = (Category) categoryResult.getResultObject();

            List<CategoryReview> categoryReviews = categoryReviewRepository.findCategoryReviewsByCategory(category);
            Map<Restaurant, CategoryReview> map = new HashMap<>();
            for (CategoryReview categoryReview : categoryReviews) {
                map.put(categoryReview.getRestaurant(), categoryReview);
            }
            List<CategoryReview> categoryReviewsTemp = map.values().stream().collect(Collectors.toCollection(ArrayList::new));
            categoryReviewsTemp.subList(0, Math.min(5, categoryReviewsTemp.size()));
            return ResultCode.Success.result(categoryReviewsTemp.subList(0, Math.min(5, categoryReviewsTemp.size())));
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

}
