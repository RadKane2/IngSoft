package com.example.demo.repositories;

import com.example.demo.models.Familiar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamiliarRepository extends JpaRepository<Familiar, Long> {
}

