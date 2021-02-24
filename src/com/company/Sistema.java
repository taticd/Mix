package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Sistema {

    public void menu() {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Digite la opcion que desea: \n" +
                    "1)Agregar elementos al presupuesto. \n" +
                    "2)Modificar un elemento. \n" +
                    "3)Eliminar un elemento. \n" +
                    "4) Finalizar."
            );
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("agregue los elementos al presupuesto");
                    Presupuesto presupuesto = new Presupuesto();
                    Servicio servicio = new Servicio();
                    System.out.println("Agregue el numero de presupuesto.");
                    presupuesto.setNumeroDePresupuesto(sc.nextInt());
                    System.out.println("Agregue el costo por hora.");
                    servicio.setCostoPorHora(Double.parseDouble(sc.nextLine()));


                    break;
                case 2:
                    System.out.println("modifique el elemento que desea modificar");
                    break;

                case 3:
                    System.out.println("elimine el elemento que desea eliminar");
                    break;
                case 4:
                    System.out.println("Finalizar. ");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }
        } while (opcion != 4);
    }

    public void agregarElementos(Presupuesto presupuesto) {
        HashMap<Integer, Presupuesto> presupuestos = new HashMap<>();
        presupuestos.put(presupuesto.getNumeroDePresupuesto(), presupuesto);
    }
}
