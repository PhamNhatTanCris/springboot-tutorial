package com.tutorial.apidemo.springboot.tutorial.repositories;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository extends JpaRepository<Unit,Long> {

}
