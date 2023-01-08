package com.newhouse.repository;

import com.newhouse.model.entity.CartGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICartGroupRepository extends JpaRepository<CartGroup, Long> {
    @Override
    Optional<CartGroup> findById(Long id);


}
