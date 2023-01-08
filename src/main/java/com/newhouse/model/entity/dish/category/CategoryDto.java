package com.newhouse.model.entity.dish.category;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    private String name;
    private String description;
    private String image;
    private int numberOfDishes;
}
