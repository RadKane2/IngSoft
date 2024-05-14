package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Servicios_Medicos")
public class ServicioMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio_medico")
    private Long id;

    @Column(name = "nombre_institucion", nullable = false, length = 100)
    private String nombreInstitucion;

    @Column(name = "tipo_servicio", nullable = false, length = 50)
    private String tipoServicio;

    @Lob
    @Column(name = "archivo_comprobante", nullable = false)
    private byte[] archivoComprobante;

    // Constructor vacío
    public ServicioMedico() {
        // Constructor vacío
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public byte[] getArchivoComprobante() {
        return archivoComprobante;
    }

    public void setArchivoComprobante(byte[] archivoComprobante) {
        this.archivoComprobante = archivoComprobante;
    }
}

