package com.newhouse.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long dishId;

    private int quantity;

    @ManyToOne
    private CartGroup cartGroup;

    @ManyToMany
    private List<Option> Options;

    public Cart(Long dishId, int quantity, List<Option> productOptions) {
        this.dishId = dishId;
        this.quantity = quantity;
        this.Options = productOptions;
    }

}
