
package Entidades;

import java.util.Date;

public class Vendedor {
    
    // atributos basicos del vendedor:
    
    private String nombre;
    private Integer dni;
    private Double sueldoBasico;
    private Double comisiones;
    
    // atributos q vamos a necesitar para los calculos
    
    private Double sueldoMensual; // totalidad del sueldo basico mas las comisiones
    private Date fechaInicio; // para averiguar atigüedad y vacacioes
    
    // constructor por defecto
    
    public Vendedor() {
    }
    
    // constructor por parametros

    public Vendedor(String nombre, Integer dni, Double sueldoBasico, Double comisiones, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }

     // getter & setter

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    // Metodo toString()

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
    
}
