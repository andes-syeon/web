package com.example.alpha.service;

import com.example.alpha.common.Result;
import com.example.alpha.common.ResultCode;
import com.example.alpha.entity.Category;
import com.example.alpha.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Result<List<Category>> getCategories() {
        try {
            List<Category> categories = categoryRepository.findAll();
            return ResultCode.Success.result(categories);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result<Category> getCategory(Integer id) {
        try {
            Optional<Category> optionalCategory = categoryRepository.findById(id);
            if (optionalCategory.isPresent()) {
                Category category = optionalCategory.get();
                return ResultCode.Success.result(category);
            }
            return ResultCode.NOT_EXISTS_RESTAURANT.result();
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }
}
