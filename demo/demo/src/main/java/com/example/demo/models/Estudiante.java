package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = false)
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "curp", nullable = false, length = 18)
    private String curp;

    @OneToOne
    @JoinColumn(name = "id_acta_nacimiento", referencedColumnName = "id_acta_nacimiento")
    private Acta actaNacimiento;

    @OneToOne
    @JoinColumn(name = "id_comprobante_estudios", referencedColumnName = "id_comprobante_estudios")
    private ComprobanteEstudios comprobanteEstudios;

    @OneToOne
    @JoinColumn(name = "id_cartilla_vacunacion", referencedColumnName = "id_cartilla_vacunacion")
    private CartillaVacunacion cartillaVacunacion;

    // Empty constructor
    public Estudiante() {
        // Empty constructor
    }

    // Getters and setters
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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Acta getActaNacimiento() {
        return actaNacimiento;
    }

    public void setActaNacimiento(Acta actaNacimiento) {
        this.actaNacimiento = actaNacimiento;
    }

    public ComprobanteEstudios getComprobanteEstudios() {
        return comprobanteEstudios;
    }

    public void setComprobanteEstudios(ComprobanteEstudios comprobanteEstudios) {
        this.comprobanteEstudios = comprobanteEstudios;
    }

    public CartillaVacunacion getCartillaVacunacion() {
        return cartillaVacunacion;
    }

    public void setCartillaVacunacion(CartillaVacunacion cartillaVacunacion) {
        this.cartillaVacunacion = cartillaVacunacion;
    }
}

