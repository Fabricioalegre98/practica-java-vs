package Logistica;


/* Incluye el atributo requiereAduana (boolean). Si requiere aduana, el costo final tiene un recargo del 30% sobre la tarifa base; de lo contrario, no tiene recargo. */
public class EnvioInternacional {

        
public class EnvioInternacional extends Envio {
    private boolean requiereAduana;

    public EnvioInternacional(String codigoRastreo, String ciudadDestino, double pesoEnKg, double tarifaBase, boolean requiereAduana) {
        super(codigoRastreo, ciudadDestino, pesoEnKg, tarifaBase);
        this.requiereAduana = requiereAduana;
    }

    @Override
    public double calcularCostoFinal() {
        if (requiereAduana) {
            return tarifaBase * 1.30;
        }
        return tarifaBase;
    }

    public boolean isRequiereAduana() {
        return requiereAduana;
    }
}

    
}
