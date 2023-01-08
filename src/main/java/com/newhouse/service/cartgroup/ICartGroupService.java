package com.newhouse.service.cartgroup;

import com.newhouse.model.entity.CartGroup;
import com.newhouse.service.IGeneralService;

import java.util.Optional;

public interface ICartGroupService extends IGeneralService<CartGroup> {

    @Override
    Optional<CartGroup> findById(Long id);



}
