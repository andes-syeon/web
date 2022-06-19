package com.example.alpha.repository;

import com.example.alpha.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import java.util.Optional;

@DataJdbcTest
public class CategoryRepositoryTest {


    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void findCategory() {

        Optional<Category> optionalCategory = categoryRepository.findById(1);
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            System.out.println(category);
        }


    }

}
