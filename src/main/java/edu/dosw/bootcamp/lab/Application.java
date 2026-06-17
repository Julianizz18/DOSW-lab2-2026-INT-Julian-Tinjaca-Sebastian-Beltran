package edu.dosw.bootcamp.lab;

import edu.dosw.bootcamp.lab.solid.reto1.Reto1TiendaDonPepe;
import edu.dosw.bootcamp.lab.solid.reto2.Reto2ChefEstrellas;

public class Application {
    public static void main(String[] args) {
        System.out.println("Proyecto Maven configurado y corriendo correctamente");

        Reto1TiendaDonPepe.ejecutar();
        Reto2ChefEstrellas.ejecutar();
    }
}