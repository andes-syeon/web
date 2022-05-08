package com.example.alpha.service;

import com.example.alpha.common.Result;
import com.example.alpha.common.ResultCode;
import com.example.alpha.entity.CategoryReview;
import com.example.alpha.repository.CategoryReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryReviewService {

    @Autowired
    private CategoryReviewRepository categoryReviewRepository;

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

}
