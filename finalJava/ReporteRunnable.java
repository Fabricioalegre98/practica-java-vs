import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReporteRunnable implements Runnable {
    private final String estacion;
    private final List<UnidadTransporte> unidades;

    public ReporteRunnable(String estacion, List<UnidadTransporte> unidades) {
        this.estacion = estacion;
        this.unidades = unidades;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("reporte_" + estacion + ".txt"))) {
            for (UnidadTransporte u : unidades) {
                writer.write("ID: " + u.getId() + " - Costo Operativo: " + u.calcularCostoOperativo());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir reporte: " + e.getMessage());
        }
    }
}
