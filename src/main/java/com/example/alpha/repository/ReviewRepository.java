package com.example.alpha.repository;

import com.example.alpha.entity.Category;
import com.example.alpha.entity.Restaurant;
import com.example.alpha.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findTop5ByRestaurantOrderByWritedttmDesc(Restaurant restaurant);
    List<Review> findReviewsByRestaurantOrderByWritedttmDesc(Restaurant restaurant);

    @Query(value =
            "SELECT " +
                    " restaurant_id " +
                    "FROM review_crawling " +
                    "GROUP BY restaurant_id " +
                    "ORDER BY COUNT(1) DESC " +
                    "LIMIT 4"
    )
    List<String> findGroupBy();


}
