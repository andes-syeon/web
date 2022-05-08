package com.example.alpha.controller.api;

import com.example.alpha.common.Result;
import com.example.alpha.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/getCategories")
    public Result getRestaurants() {
        return categoryService.getCategories();
    }
}
