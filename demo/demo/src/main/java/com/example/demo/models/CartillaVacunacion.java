package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Cartillas_Vacunacion")
public class CartillaVacunacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartilla_vacunacion")
    private Long id;

    @Lob
    @Column(name = "archivo_cartilla", nullable = false)
    private byte[] archivoCartilla;

    // Constructor vacío
    public CartillaVacunacion() {
        // Constructor vacío
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getArchivoCartilla() {
        return archivoCartilla;
    }

    public void setArchivoCartilla(byte[] archivoCartilla) {
        this.archivoCartilla = archivoCartilla;
    }
}
