package edu.dosw.bootcamp.lab.solid.reto2;

public class Reto2ChefEstrellas {

    public static void ejecutar() {
        System.out.println("\nBienvenido al Chef de 5 Estrellas");
        System.out.println("Elige tu hamburguesa:");
        System.out.println("  ¿Pan? -> Integral");
        System.out.println("  ¿Carne? -> Res doble");
        System.out.println("  ¿Queso? -> Cheddar");
        System.out.println("  ¿Vegetales? -> Lechuga, Tomate");
        System.out.println("  ¿Salsa? -> BBQ");

        HamburguesaBuilder builder = new HamburguesaBuilder()
                .setPan("Integral", 2000)
                .setCarne("Res doble", 8000)
                .setQueso("Cheddar", 1500)
                .addVegetal("Lechuga", 500)
                .addVegetal("Tomate", 500)
                .setSalsa("BBQ", 800);

        Chef chef = new Chef(builder);
        Hamburguesa hamburguesa = chef.prepararHamburguesa();
        hamburguesa.mostrar();
    }
}