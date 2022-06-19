package com.example.alpha.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "review_crawling")
public class Review {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @Column(name = "content", columnDefinition = "LONGTEXT")
    private String content;

    @Column(name = "report", length = 1)
    private String report;

    @Column(name = "writer", length = 100)
    private String writer;

    @Column(name = "writedttm", length = 45)
    private String writedttm;
}
