package com.ProyectTest.Entities;

import javax.persistence.*;

@Entity
@Table(name="movimientodinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="nombMovimiento")
    private Double monMovimiento;
    @Column(name="concMovimiento")
    private String concMovimiento="";
    @Column(name="usuario")
    private String usuario="";

    public MovimientoDinero() {
    }

    public MovimientoDinero(Double monMovimiento, String concMovimiento, String usuario) {
        this.monMovimiento = monMovimiento;
        this.concMovimiento = concMovimiento;
        this.usuario = usuario;
    }

    public Double getMonMovimiento() {
        return monMovimiento;
    }

    public void setMonMovimiento(Double monMovimiento) {
        this.monMovimiento = monMovimiento;
    }

    public String getConcMovimiento() {
        return concMovimiento;
    }

    public void setConcMovimiento(String concMovimiento) {
        this.concMovimiento = concMovimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
