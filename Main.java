import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

interface Rastreable {
    String obtenerCoordenadasGPS();
}

class RodadoInvalidoException extends Exception {
    public RodadoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

abstract class UnidadTransporte {
    protected String id;
    protected String modelo;
    protected int capacidadPasajeros;
    protected double costoMantenimientoBase;

    public UnidadTransporte(String id, String modelo, int capacidadPasajeros, double costoMantenimientoBase) {
        this.id = id;
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.costoMantenimientoBase = costoMantenimientoBase;
    }

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public double getCostoMantenimientoBase() {
        return costoMantenimientoBase;
    }

    public abstract double calcularCostoOperativo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnidadTransporte that = (UnidadTransporte) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class ColectivoElectrico extends UnidadTransporte implements Rastreable {
    protected boolean tieneAireAcondicionado;

    public ColectivoElectrico(String id, String modelo, int capacidadPasajeros, double costoMantenimientoBase, boolean tieneAireAcondicionado) {
        super(id, modelo, capacidadPasajeros, costoMantenimientoBase);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    @Override
    public double calcularCostoOperativo() {
        if (tieneAireAcondicionado) {
            return costoMantenimientoBase * 1.20;
        }
        return costoMantenimientoBase;
    }

    @Override
    public String obtenerCoordenadasGPS() {
        return "-34.6037, -58.3816";
    }
}

class BicicletaCompartida extends UnidadTransporte {
    protected int rodado;

    public BicicletaCompartida(String id, String modelo, int capacidadPasajeros, double costoMantenimientoBase, int rodado) throws RodadoInvalidoException {
        super(id, modelo, capacidadPasajeros, costoMantenimientoBase);
        if (rodado != 26 && rodado != 29) {
            throw new RodadoInvalidoException("Rodado invalido: " + rodado + ". Solo se permite rodado 26 o 29.");
        }
        this.rodado = rodado;
    }

    public int getRodado() {
        return rodado;
    }

    @Override
    public double calcularCostoOperativo() {
        return costoMantenimientoBase;
    }
}

class TransitManager {
    private Map<String, List<UnidadTransporte>> inventario = new HashMap<>();

    public void agregarUnidad(String estacion, UnidadTransporte u) {
        if (!inventario.containsKey(estacion)) {
            inventario.put(estacion, new ArrayList<>());
        }
        List<UnidadTransporte> lista = inventario.get(estacion);
        if (!lista.contains(u)) {
            lista.add(u);
        }
    }

    public Map<String, List<UnidadTransporte>> getInventario() {
        return inventario;
    }
}

class ReporteRunnable implements Runnable {
    private String estacion;
    private List<UnidadTransporte> unidades;

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
