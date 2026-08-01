public class BicicletaCompartida extends UnidadTransporte {
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
