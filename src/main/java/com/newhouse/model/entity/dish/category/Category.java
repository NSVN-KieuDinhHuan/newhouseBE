package com.newhouse.model.entity.dish.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String name;

    @Column(columnDefinition = "varchar(1000) default 'product-default.jpg'")
    private String image;

    @NotNull
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String description;

    @NotNull
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private int numberOfDishes;


}
