package com.example.alpha.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "original_name", length = 45)
    private String originalName;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "address", length = 1000)
    private String address;

    @Column(name = "local", length = 45)
    private String local;

    @Column(name = "operation", length = 100)
    private String operation;

    @Column(name = "number", length = 45)
    private String number;


    @Column(name = "regdttm")
    private LocalDate regDttm;


    @Column(name = "infodttm")
    private LocalDate infoDttm;

    @Column(name = "star")
    private double star;
}
