package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Presupuesto {

    private int numeroDePresupuesto;
    private Double total;
    private ArrayList<Servicio> servicios;

    public Presupuesto(int numeroDePresupuesto, ArrayList<Servicio> servicios, double total) {
        this.numeroDePresupuesto = numeroDePresupuesto;
        this.servicios = servicios;
        this.total = total;
    }

    public Presupuesto() {
        servicios = new ArrayList<Servicio>();
    }

    public int getNumeroDePresupuesto() {
        return numeroDePresupuesto;
    }

    public void setNumeroDePresupuesto(int numeroDePresupuesto) {
        this.numeroDePresupuesto = numeroDePresupuesto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
}
