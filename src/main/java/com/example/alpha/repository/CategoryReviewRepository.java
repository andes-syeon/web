package com.example.alpha.repository;

import com.example.alpha.entity.CategoryReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryReviewRepository extends JpaRepository<CategoryReview, Integer> {
}
