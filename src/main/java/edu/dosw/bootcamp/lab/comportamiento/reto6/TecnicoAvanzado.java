package edu.dosw.bootcamp.lab.comportamiento.reto6;

public class TecnicoAvanzado extends Tecnico {
    @Override
    public void manejar(Ticket ticket, StringBuilder ruta) {
        if (ticket.getNivel().equals("avanzado")) {
            ticket.resolver("Tecnico Avanzado");
            ruta.append("Tecnico Avanzado resolvio.");
        } else {
            ruta.append("Sin tecnico disponible.\n     Ticket pendiente de escalamiento.");
        }
    }
}
