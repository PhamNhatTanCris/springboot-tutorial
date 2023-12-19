package com.tutorial.apidemo.springboot.tutorial.controllers;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Unit;
import com.tutorial.apidemo.springboot.tutorial.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/unit")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping
    public List<Unit> getAllUnit(){
        return unitService.getAllUnit();
    }

    @GetMapping("/{id}")
    public Unit getUnitById(@PathVariable Long id) {
        return unitService.getUnitById(id);
    }

    @GetMapping("/create/{id}")
    public Unit getUnitById(@PathVariable Unit unit) {
        return unitService.createUnit(unit);
    }

    @PutMapping("/update/{id}")
    public Unit updateUnit(@PathVariable Long id, @RequestBody Unit unit) {
        return unitService.updateUnit(id, unit);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUnit(@PathVariable Long id) {
        unitService.deleteUnit(id);
    }
}
