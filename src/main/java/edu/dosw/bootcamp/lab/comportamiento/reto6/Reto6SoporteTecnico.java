package edu.dosw.bootcamp.lab.comportamiento.reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto6SoporteTecnico {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        TecnicoBasico basico = new TecnicoBasico();
        TecnicoIntermedio intermedio = new TecnicoIntermedio();
        TecnicoAvanzado avanzado = new TecnicoAvanzado();
        basico.setSiguiente(intermedio).setSiguiente(avanzado);

        System.out.print("Ingrese cuantos tickets: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        List<Ticket> tickets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("T%d - Descripcion: ", i);
            String desc = sc.nextLine().trim();
            System.out.printf("T%d - Nivel (basico/intermedio/avanzado/critico): ", i);
            String nivel = sc.nextLine().trim();
            System.out.printf("T%d - Prioridad (baja/media/alta): ", i);
            String prioridad = sc.nextLine().trim();
            tickets.add(new Ticket(desc, nivel, prioridad));
        }

        System.out.println();
        for (int i = 0; i < tickets.size(); i++) {
            StringBuilder ruta = new StringBuilder();
            basico.manejar(tickets.get(i), ruta);
            System.out.printf("T%d: %s%n", i + 1, ruta);
        }

        long resBasico = tickets.stream().filter(t -> t.isResuelto() && t.getResolvedBy().equals("Tecnico Basico")).count();
        long resInterm = tickets.stream().filter(t -> t.isResuelto() && t.getResolvedBy().equals("Tecnico Intermedio")).count();
        long resAvanz  = tickets.stream().filter(t -> t.isResuelto() && t.getResolvedBy().equals("Tecnico Avanzado")).count();
        long pendientes = tickets.stream().filter(t -> !t.isResuelto()).count();
        double promPrioridad = tickets.stream().filter(Ticket::isResuelto).mapToInt(Ticket::getPrioridadValor).average().orElse(0);

        System.out.println("\n--- Estadisticas ---");
        System.out.printf("Resueltos - Basico: %d%n", resBasico);
        System.out.printf("Interm: %d  Avanz: %d%n", resInterm, resAvanz);
        System.out.printf("%nPendientes de escalamiento: %d%n", pendientes);
        System.out.printf("Promedio prioridad resueltos: %.1f%n", promPrioridad);
    }
}
