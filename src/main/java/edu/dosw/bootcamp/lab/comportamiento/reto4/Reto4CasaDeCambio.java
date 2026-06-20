package edu.dosw.bootcamp.lab.comportamiento.reto4;

import java.util.Scanner;

public class Reto4CasaDeCambio {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        CasaDeCambio casaDeCambio = new CasaDeCambio();

        System.out.println("Casa de Cambio");
        System.out.println("Cuántas transacciones desea");
        int transacciones = scanner.nextInt();
        scanner.nextLine();

        double totalUsd = 0;

        for (int i = 1; i <= transacciones; i++) {
            System.out.println("\nTransacción " + i + ":");
            System.out.println("De qué moneda (COP / EUR / USD): ");
            String origen = scanner.nextLine();

            System.out.println("A qué moneda (USD / COP / JPY): ");
            String destino = scanner.nextLine();

            System.out.println("Cuánto desea convertir ");
            double monto = scanner.nextDouble();
            scanner.nextLine();

            if (origen.equalsIgnoreCase("COP") && destino.equalsIgnoreCase("USD")) {
                casaDeCambio.setStrategy(new CopToUsdStrategy());
            } else if (origen.equalsIgnoreCase("EUR") && destino.equalsIgnoreCase("COP")) {
                casaDeCambio.setStrategy(new EurToCopStrategy());
            } else if (origen.equalsIgnoreCase("USD") && destino.equalsIgnoreCase("JPY")) {
                casaDeCambio.setStrategy(new UsdToJpyStrategy());
            } else {
                System.out.println("Conversión no soportada.");
                continue;
            }

            double resultado = casaDeCambio.convertir(monto);
            totalUsd += new CopToUsdStrategy().convertir(
                    origen.equalsIgnoreCase("COP") ? monto : resultado
            );

            System.out.println("Tx " + i + ": " + monto + " " + origen + " = " + String.format("%.2f", resultado) + " " + destino);
        }

        System.out.println("\nResumen");
        System.out.println("Total USD equivalente: $" + (double)Math.round(totalUsd * 100) / 100);
        System.out.println("¡Gracias por usar la casa de cambio DOSW!");

        scanner.close();
    }

    public static void main(String[] args) {
        ejecutar();
    }
}