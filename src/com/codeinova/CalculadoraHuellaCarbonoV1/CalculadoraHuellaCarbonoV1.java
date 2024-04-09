package com.codeinova.CalculadoraHuellaCarbonoV1;

public class CalculadoraHuellaCarbonoV1 {

    public static void main(String[] args) {

        // Definición de variables:

        // Consumo promedio de energía en Colombia de un portátil, un microondas y un televisor en vatios:
        double consumoPortatil = 60;
        double consumoMicroondas = 1000;
        double consumoTelevisor = 150;

        // Consumo promedio de combustible en Colombia:
        double consumoMoto = 2.5;
        double consumoBus = 6.0;

        /*
        Cantidad promedio de horas y minutos usando los electrodomésticos al mes
        y
        Cantidad de kilómetros recorridos al mes:
         */
        double horasUsoPortatil = 60;
        double minutosUsoMicroondas = 120;
        double horasUsoTelevisor = 90;
        double kilometrosMoto = 500;
        double kilometrosBus = 300;

        // Llamado a las funciones:

        // Huella de carbono producida al mes por consumo de energía:
        double huellaEnergia = calculoHuellaEnergia(consumoPortatil, consumoMicroondas, consumoTelevisor,
                horasUsoPortatil, minutosUsoMicroondas, horasUsoTelevisor);


        // Huella de carbono producida al mes por consumo de transporte:
        double huellaTransporte = calculoHuellaTransporte(consumoMoto, consumoBus, kilometrosMoto, kilometrosBus);

        System.out.println("Huella de carbono producida al mes por consumo de energía: " + huellaEnergia + " kg CO2");
        System.out.println("Huella de carbono producida al mes por uso de transporte: " + huellaTransporte + " kg CO2");
        System.out.println("Total huella de carbono producida al mes: " + (huellaEnergia + huellaTransporte) + " kg CO2");
    }

        //Definición de las funciones llamadas
    public static double calculoHuellaEnergia(double consumoPortatil, double consumoMicroondas, double consumoTelevisor, double horasUsoPortatil, double minutosUsoMicroondas, double horasUsoTelevisor) {

        // Convertir minutos de uso de microondas a horas
        double horasUsoMicroondas = minutosUsoMicroondas / 60;

        // Calcular consumo de energía en kilovatios-hora
        double consumoEnergia = (consumoPortatil * horasUsoPortatil + consumoMicroondas * horasUsoMicroondas + consumoTelevisor * horasUsoTelevisor) / 1000;

        return consumoEnergia;
    }
    public static double calculoHuellaTransporte(double consumoMoto, double consumoBus, double kilometrosMoto, double kilometrosBus) {
        double huellaTransporte = 0;

        //Ajuste de unidades a litros
        if (kilometrosMoto > 0) {
            huellaTransporte += consumoMoto * (kilometrosMoto / 100);
        }

        if (kilometrosBus > 0) {
            huellaTransporte += consumoBus * (kilometrosBus / 100);
        }
        return huellaTransporte;
    }
   // Esto es un comentario de prueba
}


