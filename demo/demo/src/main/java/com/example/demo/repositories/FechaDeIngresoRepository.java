package com.example.demo.repositories;

import com.example.demo.models.FechaIngreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FechaDeIngresoRepository extends JpaRepository<FechaIngreso, Long> {
}

