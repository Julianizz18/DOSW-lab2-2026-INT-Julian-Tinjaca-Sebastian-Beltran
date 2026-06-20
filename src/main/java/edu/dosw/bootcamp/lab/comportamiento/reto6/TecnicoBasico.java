package edu.dosw.bootcamp.lab.comportamiento.reto6;

public class TecnicoBasico extends Tecnico {
    @Override
    public void manejar(Ticket ticket, StringBuilder ruta) {
        if (ticket.getNivel().equals("basico")) {
            ticket.resolver("Tecnico Basico");
            ruta.append("Tecnico Basico resolvio.");
        } else if (siguiente != null) {
            ruta.append("Tecnico Basico -> ");
            siguiente.manejar(ticket, ruta);
        } else {
            ruta.append("Sin tecnico disponible.\n     Ticket pendiente de escalamiento.");
        }
    }
}
