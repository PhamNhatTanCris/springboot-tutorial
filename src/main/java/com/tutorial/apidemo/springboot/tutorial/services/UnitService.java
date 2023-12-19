package com.tutorial.apidemo.springboot.tutorial.services;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Unit;

import java.util.List;

public interface UnitService {
    List<Unit> getAllUnit();

    Unit getUnitById(Long id);

    Unit createUnit(Unit unit);

    Unit updateUnit(Long id, Unit unit);

    void deleteUnit(Long id);

}
