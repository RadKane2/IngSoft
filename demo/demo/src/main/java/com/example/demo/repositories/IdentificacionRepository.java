package com.example.demo.repositories;

import com.example.demo.models.Identificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificacionRepository extends JpaRepository<Identificacion, Long> {
}

