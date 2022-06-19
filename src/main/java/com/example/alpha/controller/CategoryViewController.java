package com.example.alpha.controller;

import com.example.alpha.common.Result;
import com.example.alpha.entity.Category;
import com.example.alpha.entity.CategoryReview;
import com.example.alpha.service.CategoryReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryViewController {

    @Autowired
    private CategoryReviewService categoryReviewService;

    @RequestMapping("/category/{category}")
    public String category(@PathVariable String category, Model model) {
        System.out.println("category : " + category);

        Result<List<CategoryReview>> result = categoryReviewService.getCategoryReview(category);
        if (result.isSuccess()) {
            List<CategoryReview> categoryReviews = result.getResultObject();
            for (CategoryReview categoryReview : categoryReviews) {
                System.out.println("categoryReview : " + categoryReview);
            }
            model.addAttribute("categoryReviews", categoryReviews);
        }

        return "category";
    }
}
