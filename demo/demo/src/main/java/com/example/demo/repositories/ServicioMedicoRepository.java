package com.example.demo.repositories;

import com.example.demo.models.ServicioMedico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicioMedicoRepository extends JpaRepository<ServicioMedico, Long> {
}
