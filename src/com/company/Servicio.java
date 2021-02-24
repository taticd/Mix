package com.company;

public class Servicio {

    private double costoPorHora;
    private int cantidadDeHoras;
    private String nombre;
    private String descripcion;
    private String nombreDePersona;


    public Servicio(double costoPorHora, int cantidadDeHoras, String nombre, String descripcion, String nombreDePersona) {
        this.costoPorHora = costoPorHora;
        this.cantidadDeHoras = cantidadDeHoras;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreDePersona = nombreDePersona;
    }

    public Servicio() {
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public int getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(int cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreDePersona() {
        return nombreDePersona;
    }

    public void setNombreDePersona(String nombreDePersona) {
        this.nombreDePersona = nombreDePersona;
    }
}
