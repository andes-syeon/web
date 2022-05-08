package com.example.alpha.controller.api;

import com.example.alpha.common.Result;
import com.example.alpha.service.CategoryReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoryReviewController {

    @Autowired
    private CategoryReviewService categoryReviewService;

    @RequestMapping("/getCategoryReviews")
    public Result getCategoryReviews() {
        return categoryReviewService.getCategoryReviews();
    }
}
