package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Identificaciones")
public class Identificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_identificacion")
    private Long id;

    @Column(name = "tipo_identificacion", nullable = false, length = 20)
    private String tipoIdentificacion;

    @Lob
    @Column(name = "archivo_identificacion", nullable = false)
    private byte[] archivoIdentificacion;

    // Constructor vacío
    public Identificacion() {
        // Constructor vacío
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public byte[] getArchivoIdentificacion() {
        return archivoIdentificacion;
    }

    public void setArchivoIdentificacion(byte[] archivoIdentificacion) {
        this.archivoIdentificacion = archivoIdentificacion;
    }
}

