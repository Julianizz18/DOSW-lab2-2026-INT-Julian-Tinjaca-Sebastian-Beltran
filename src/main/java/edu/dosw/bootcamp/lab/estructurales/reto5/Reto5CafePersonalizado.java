package edu.dosw.bootcamp.lab.estructurales.reto5;

import java.util.Scanner;

public class Reto5CafePersonalizado {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cafetería Creativa");
        System.out.println("Café base: Espresso (89500)");
        System.out.println("\nElige tus toppings:");
        System.out.println("1. Leche de avena (2000)");
        System.out.println("2. Caramelo (23800)");
        System.out.println("3. Chantilly (15000)");

        Cafe cafe = new CafeBase();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n¿Qué topping desea agregar si no deseas 0 para finalizar con el pedido");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1": cafe = new LecheAvenaDecorator(cafe); System.out.println("Leche de avena agregada."); break;
                case "2": cafe = new CarameloDecorator(cafe); System.out.println("Caramelo agregado."); break;
                case "3": cafe = new ChantillyDecorator(cafe); System.out.println("Chantilly agregado."); break;
                case "0": continuar = false; break;
                default: System.out.println("Opción no válida.");
            }
        }

        System.out.println("\nTu Café");
        System.out.println(cafe.getDescripcion());
        System.out.println("Total: $" + (int)cafe.getPrecio());
        System.out.println("Disfruta");

        scanner.close();
    }

    public static void main(String[] args) {
        ejecutar();
    }
}