public class ColectivoElectrico extends UnidadTransporte implements Rastreable {
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
