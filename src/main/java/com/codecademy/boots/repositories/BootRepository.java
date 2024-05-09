package com.codecademy.boots.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.boots.entities.Boot;
import com.codecademy.boots.enums.BootType;

public interface BootRepository extends CrudRepository <Boot, Integer> {
List<Boot> findBySize(Float size);
List<Boot> findByMaterial(String material);
List<Boot> findByType(BootType type);
List<Boot> findByQuantityGreaterThan(Integer quantity);
}