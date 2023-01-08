package com.newhouse.repository;

import com.newhouse.model.entity.OptionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOptGroupRepository extends JpaRepository<OptionGroup, Long> {


}