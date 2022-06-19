package com.example.alpha.repository;

import com.example.alpha.entity.Category;
import com.example.alpha.entity.CategoryReview;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryReviewRepository extends JpaRepository<CategoryReview, Integer> {
    List<CategoryReview> findCategoryReviewsByCategory(Category category);
}
