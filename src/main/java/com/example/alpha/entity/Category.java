package com.example.alpha.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

}
