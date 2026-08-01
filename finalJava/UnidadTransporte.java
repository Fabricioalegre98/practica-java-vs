import java.util.Objects;

public abstract class UnidadTransporte {
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
