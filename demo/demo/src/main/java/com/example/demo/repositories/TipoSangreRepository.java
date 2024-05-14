package com.example.demo.repositories;

import com.example.demo.models.TipoSangre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoSangreRepository extends JpaRepository<TipoSangre, Long> {
}
