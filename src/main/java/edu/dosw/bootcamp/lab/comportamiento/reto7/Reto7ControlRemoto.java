package edu.dosw.bootcamp.lab.comportamiento.reto7;

import java.util.Scanner;

public class Reto7ControlRemoto {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        ControlRemoto control = new ControlRemoto();

        System.out.println("Control Remoto Magico");
        System.out.println("Dispositivos: luces, puertas, musica, persianas");

        System.out.print("¿Cuantos usuarios van a usar el control? ");
        int numUsuarios = Integer.parseInt(sc.nextLine().trim());

        for (int u = 1; u <= numUsuarios; u++) {
            System.out.print("\nNombre de usuario " + u + ": ");
            String usuario = sc.nextLine().trim();

            System.out.print("¿Cuantas acciones realizara " + usuario + "? ");
            int numAcciones = Integer.parseInt(sc.nextLine().trim());

            for (int i = 1; i <= numAcciones; i++) {
                System.out.printf("Accion %d - Dispositivo (luces/puertas/musica/persianas): ", i);
                String dispositivo = sc.nextLine().trim().toLowerCase();

                Comando comando = null;

                switch (dispositivo) {
                    case "luces" -> {
                        System.out.print("  Accion (encender/apagar): ");
                        String accion = sc.nextLine().trim();
                        int intensidad = 0;
                        if (accion.equalsIgnoreCase("encender")) {
                            System.out.print("  Intensidad (%): ");
                            intensidad = Integer.parseInt(sc.nextLine().trim());
                        }
                        comando = new ComandoLuces(accion, intensidad);
                    }
                    case "puertas" -> {
                        System.out.print("  Accion (abrir/cerrar): ");
                        String accion = sc.nextLine().trim();
                        comando = new ComandoPuertas(accion);
                    }
                    case "musica" -> {
                        System.out.print("  Accion (reproducir/parar): ");
                        String accion = sc.nextLine().trim();
                        int volumen = 0;
                        if (accion.equalsIgnoreCase("reproducir") || accion.equalsIgnoreCase("play")) {
                            System.out.print("  Volumen (0-100): ");
                            volumen = Integer.parseInt(sc.nextLine().trim());
                        }
                        comando = new ComandoMusica(accion, volumen);
                    }
                    case "persianas" -> {
                        System.out.print("  Accion (subir/bajar): ");
                        String accion = sc.nextLine().trim();
                        System.out.print("  Porcentaje (%): ");
                        int porcentaje = Integer.parseInt(sc.nextLine().trim());
                        comando = new ComandoPersianas(accion, porcentaje);
                    }
                    default -> {
                        System.out.println("  Dispositivo no reconocido. Intente de nuevo.");
                        i--;
                    }
                }

                if (comando != null) {
                    control.ejecutar(comando, usuario);
                }
            }
        }

        System.out.print("\n¿Desea deshacer alguna accion? (si/no): ");
        String resp = sc.nextLine().trim().toLowerCase();
        while (resp.equals("si")) {
            System.out.print("Numero de accion a deshacer: ");
            try {
                int num = Integer.parseInt(sc.nextLine().trim());
                control.deshacer(num);
            } catch (NumberFormatException e) {
                System.out.println("  Ingrese un numero valido.");
            }
            System.out.print("¿Deshacer otra? (si/no): ");
            resp = sc.nextLine().trim().toLowerCase();
        }

        control.mostrarHistorial();
    }
}
