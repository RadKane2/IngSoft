package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Comprobantes_Estudios")
public class ComprobanteEstudios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comprobante_estudios")
    private Long id;

    @Column(name = "nivel_escolar", nullable = false, length = 20)
    private String nivelEscolar;

    @Lob
    @Column(name = "archivo_comprobante", nullable = false)
    private byte[] archivoComprobante;

    // Empty constructor
    public ComprobanteEstudios() {
        // Empty constructor
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public byte[] getArchivoComprobante() {
        return archivoComprobante;
    }

    public void setArchivoComprobante(byte[] archivoComprobante) {
        this.archivoComprobante = archivoComprobante;
    }
}

