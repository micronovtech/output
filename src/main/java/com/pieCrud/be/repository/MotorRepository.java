package com.pieCrud.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pieCrud.be.entity.Motor;

public interface MotorRepository extends JpaRepository<Motor, Long> {
}
