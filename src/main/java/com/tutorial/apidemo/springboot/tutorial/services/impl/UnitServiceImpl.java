package com.tutorial.apidemo.springboot.tutorial.services.impl;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Unit;
import com.tutorial.apidemo.springboot.tutorial.repositories.UnitRepository;
import com.tutorial.apidemo.springboot.tutorial.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {
    @Autowired
    private UnitRepository unitRepository;

    @Override
    public List<Unit> getAllUnit() {
        return unitRepository.findAll();
    }

    @Override
    public Unit getUnitById(Long id) {
        return unitRepository.findById(id).orElse(null);
    }

    @Override
    public Unit createUnit(Unit unit) {
        return unitRepository.save(unit);
    }

    @Override
    public Unit updateUnit(Long id, Unit udUnit){
        return unitRepository.findById(id).map(unit -> {
            unit.setUnitName(udUnit.getUnitName());
            return unitRepository.save(unit);
        }).orElseThrow(() -> new RuntimeException("Không tìm thấy unit có id = " + id));
    }

    @Override
    public void deleteUnit(Long id) {
        unitRepository.deleteById(id);
    }
}
