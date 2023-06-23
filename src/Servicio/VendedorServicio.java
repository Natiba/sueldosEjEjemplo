package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {

    Scanner sc = new Scanner(System.in);

    // Creo un objeto altaVendedor
    public Vendedor altaVendedor() {

        // Instancio un objeto de tipo vendedor
        Vendedor v1 = new Vendedor(); // Uso el constructor vacio de Vendedor

        // Lleno los atributos
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(sc.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(sc.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(sc.nextDouble());
        System.out.println("Ingrese el día en que comenzó a trabajar");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes en que comenzó a trabajar");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año en que comenzó a trabajar");
        int anio = sc.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1; // le pido que retorne el objeto v1 con todo lo que le cargamos
    }

    //  Metodo para calcular las comisiones. Por parametro le paso el objeto del q quiero conseguir ese dato
    public void sueldoMensual(Vendedor v1) {

        System.out.println("Cuales fueron las ventas totales del vendedor");
        Double ventas = sc.nextDouble();
        v1.setComisiones(ventas * 0.15);  // Multiplico las ventas x el 15%
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo total del vnededor " + v1.getNombre() + " es de " + v1.getSueldoMensual());
    }

    // Metodo para averiguar la antigüedad y calcular las vacaciones
    public void vacaciones(Vendedor v1) {
        // Primero vamos a calcular la fecha de hoy
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();  // ver bien como se saca

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 días de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 días de vacaciones");
        } else if (antiguedad<20) {
            System.out.println("Le corresponden 28 días de vacaciones");
    } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 días de vacaciones");
    } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
    }

}
}
