package edu.dosw.bootcamp.lab.comportamiento.reto7;

import java.util.ArrayList;
import java.util.List;

public class ControlRemoto {
    private final List<RegistroAccion> historial = new ArrayList<>();

    public void ejecutar(Comando comando, String usuario) {
        comando.ejecutar();
        System.out.println("  [" + usuario + "]");
        historial.add(new RegistroAccion(comando, usuario));
    }

    public void deshacer(int numeroAccion) {
        int index = numeroAccion - 1;
        if (index < 0 || index >= historial.size()) {
            System.out.println("Accion #" + numeroAccion + " no existe.");
            return;
        }
        RegistroAccion registro = historial.get(index);
        if (registro.isDeshecho()) {
            System.out.println("Accion #" + numeroAccion + " ya fue deshecha.");
            return;
        }
        registro.getComando().deshacer();
        registro.setDeshecho(true);
    }

    public void mostrarHistorial() {
        System.out.println("\n--- Historial ---");
        for (int i = 0; i < historial.size(); i++) {
            RegistroAccion r = historial.get(i);
            String estado = r.isDeshecho() ? "[DESHECHO] " : "";
            System.out.printf("#%d %s%s - %s%n", i + 1, estado, r.getComando().getDescripcion(), r.getUsuario());
        }
    }
}
