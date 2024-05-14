package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "familiares")
public class Familiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Parentesco", nullable = false, length = 50)
    private String parentesco;

    @Column(name = "Domicilio_actual", nullable = false, length = 200)
    private String domicilioActual;

    @Column(name = "Edad", nullable = false)
    private int edad;

    @Column(name = "Ocupacion", length = 100)
    private String ocupacion;

    @Column(name = "Puesto", length = 100)
    private String puesto;

    @Column(name = "Domicilio_trabajo", length = 200)
    private String domicilioTrabajo;

    @Column(name = "Estado_Civil", length = 20)
    private String estadoCivil;

    @Column(name = "Escolaridad", length = 100)
    private String escolaridad;

    @Column(name = "Lugar", length = 100)
    private String lugar;

    @Column(name = "Horario", length = 50)
    private String horario;

    @Column(name = "Sueldo", precision = 10, scale = 2)
    private Double sueldo;

    // Constructor
    public Familiar() {
        // Constructor vacío
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getDomicilioActual() {
        return domicilioActual;
    }

    public void setDomicilioActual(String domicilioActual) {
        this.domicilioActual = domicilioActual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDomicilioTrabajo() {
        return domicilioTrabajo;
    }

    public void setDomicilioTrabajo(String domicilioTrabajo) {
        this.domicilioTrabajo = domicilioTrabajo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
