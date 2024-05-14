package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Tipos_Sangre")
public class TipoSangre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_sangre")
    private Long id;

    @Column(name = "tipo_sangre", nullable = false, length = 5)
    private String tipoSangre;

    @Lob
    @Column(name = "archivo_comprobante", nullable = false)
    private byte[] archivoComprobante;

    // Constructor vacío
    public TipoSangre() {
        // Constructor vacío
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public byte[] getArchivoComprobante() {
        return archivoComprobante;
    }

    public void setArchivoComprobante(byte[] archivoComprobante) {
        this.archivoComprobante = archivoComprobante;
    }
}

