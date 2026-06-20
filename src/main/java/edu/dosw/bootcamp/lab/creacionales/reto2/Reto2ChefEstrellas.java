package edu.dosw.bootcamp.lab.creacionales.reto2;

import java.util.Scanner;

public class Reto2ChefEstrellas {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nBienvenido al Chef de 5 Estrellas");

        System.out.print("¿Pan? (Integral/Blanco): ");
        String pan = sc.nextLine();

        System.out.print("¿Carne? (Res simple/Res doble): ");
        String carne = sc.nextLine();

        System.out.print("¿Queso? (Cheddar/Mozzarella): ");
        String queso = sc.nextLine();

        System.out.print("¿Primer vegetal? (Lechuga/Tomate/Cebolla): ");
        String vegetal1 = sc.nextLine();

        System.out.print("¿Segundo vegetal? (Lechuga/Tomate/Cebolla): ");
        String vegetal2 = sc.nextLine();

        System.out.print("¿Salsa? (BBQ/Ketchup): ");
        String salsa = sc.nextLine();

        HamburguesaBuilder builder = new HamburguesaBuilder()
                .setPan(pan, 2000)
                .setCarne(carne, 8000)
                .setQueso(queso, 1500)
                .addVegetal(vegetal1, 500)
                .addVegetal(vegetal2, 500)
                .setSalsa(salsa, 800);

        Chef chef = new Chef(builder);
        Hamburguesa hamburguesa = chef.prepararHamburguesa();

        hamburguesa.mostrar();
    }
}