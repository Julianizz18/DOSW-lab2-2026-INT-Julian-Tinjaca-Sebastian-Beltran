package edu.dosw.bootcamp.lab;

import edu.dosw.bootcamp.lab.comportamiento.reto6.Reto6SoporteTecnico;
import edu.dosw.bootcamp.lab.comportamiento.reto7.Reto7ControlRemoto;
import edu.dosw.bootcamp.lab.creacionales.reto3.Reto3ReinoVehiculos;
import edu.dosw.bootcamp.lab.solid.reto1.Reto1TiendaDonPepe;
import edu.dosw.bootcamp.lab.creacionales.reto2.Reto2ChefEstrellas;

public class Application {
    public static void main(String[] args) {
        System.out.println("Proyecto Maven configurado y corriendo correctamente");
        Reto1TiendaDonPepe.ejecutar();
        Reto2ChefEstrellas.ejecutar();
        Reto3ReinoVehiculos.ejecutar();
        Reto6SoporteTecnico.ejecutar();
        Reto7ControlRemoto.ejecutar();

    }
}