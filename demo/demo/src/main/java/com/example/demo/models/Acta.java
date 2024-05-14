package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


import jakarta.persistence.Column;

@Entity
@Table(name = "Actas")
public class Acta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acta_nacimiento")
    private Long id;

    @Lob
    @Column(name = "archivo_acta", nullable = false)
    private byte[] archivoActa;

    // Constructor vacío
    public Acta() {
        // Constructor vacío
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getArchivoActa() {
        return archivoActa;
    }

    public void setArchivoActa(byte[] archivoActa) {
        this.archivoActa = archivoActa;
    }
} // Add this closing curly brace