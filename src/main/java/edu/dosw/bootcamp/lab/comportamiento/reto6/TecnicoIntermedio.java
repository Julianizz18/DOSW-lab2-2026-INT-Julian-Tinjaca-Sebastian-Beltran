package edu.dosw.bootcamp.lab.comportamiento.reto6;

public class TecnicoIntermedio extends Tecnico {
    @Override
    public void manejar(Ticket ticket, StringBuilder ruta) {
        if (ticket.getNivel().equals("intermedio")) {
            ticket.resolver("Tecnico Intermedio");
            ruta.append("Tecnico Intermedio resolvio.");
        } else if (siguiente != null) {
            ruta.append("Tecnico Intermedio -> ");
            siguiente.manejar(ticket, ruta);
        } else {
            ruta.append("Sin tecnico disponible.\n     Ticket pendiente de escalamiento.");
        }
    }
}
