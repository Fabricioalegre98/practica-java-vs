import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TransitManager manager = new TransitManager();

        try {
            ColectivoElectrico col1 = new ColectivoElectrico("C1", "E-Bus 200", 40, 1000.0, true);
            BicicletaCompartida bici1 = new BicicletaCompartida("B1", "Mountain Eco", 1, 50.0, 29);
            manager.agregarUnidad("Estacion Centro", col1);
            manager.agregarUnidad("Estacion Centro", bici1);

            ColectivoElectrico col2 = new ColectivoElectrico("C2", "E-Bus 100", 30, 800.0, false);
            BicicletaCompartida bici2 = new BicicletaCompartida("B2", "Urban Classic", 1, 40.0, 26);
            manager.agregarUnidad("Estacion Campus UTN", col2);
            manager.agregarUnidad("Estacion Campus UTN", bici2);
        } catch (RodadoInvalidoException e) {
            System.err.println("Excepcion atrapada: " + e.getMessage());
        }

        try {
            BicicletaCompartida biciInvalida = new BicicletaCompartida("B3", "Mini", 1, 30.0, 20);
            manager.agregarUnidad("Estacion Centro", biciInvalida);
        } catch (RodadoInvalidoException e) {
            System.out.println("Excepcion atrapada correctamente: " + e.getMessage());
        }

        Map<String, List<UnidadTransporte>> inventario = manager.getInventario();
        List<UnidadTransporte> centroUnidades = inventario.get("Estacion Centro");
        List<UnidadTransporte> utnUnidades = inventario.get("Estacion Campus UTN");

        if (centroUnidades != null && utnUnidades != null) {
            Thread hiloCentro = new Thread(new ReporteRunnable("Estacion Centro", centroUnidades));
            Thread hiloUtn = new Thread(new ReporteRunnable("Estacion Campus UTN", utnUnidades));

            hiloCentro.start();
            hiloUtn.start();

            try {
                hiloCentro.join();
                hiloUtn.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
