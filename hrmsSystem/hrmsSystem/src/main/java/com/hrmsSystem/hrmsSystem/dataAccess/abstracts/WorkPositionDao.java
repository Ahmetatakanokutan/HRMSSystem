package com.hrmsSystem.hrmsSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrmsSystem.hrmsSystem.entities.concretes.WorkPosition;

public interface WorkPositionDao extends JpaRepository<WorkPosition, Integer>{
WorkPosition findByname(String name);
}
