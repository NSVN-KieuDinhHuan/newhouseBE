package com.newhouse.model.dto.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private Long id;
    private Long dishId;
    private List<Long> optionList;
    private int quantity;
    private Long cartGroupId;
}
