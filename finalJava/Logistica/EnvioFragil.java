package Logistica;


/* Incluye el atributo nivelFragilidad (int). Debe validar mediante una excepción personalizada (Checked) denominada FragilidadInvalidaException que el nivel sea exclusivamente 1, 2 o 3; de lo contrario, lanzar la excepción indicando el error. */
public class EnvioFragil {

    
public class EnvioFragil extends Envio {
    private int nivelFragilidad;

    public EnvioFragil(String codigoRastreo, String ciudadDestino, double pesoEnKg, double tarifaBase, int nivelFragilidad) {
        super(codigoRastreo, ciudadDestino, pesoEnKg, tarifaBase);
        this.nivelFragilidad = nivelFragilidad;
    }

    public int getNivelFragilidad() {
        return nivelFragilidad;
    }

    public void setNivelFragilidad(int nivelFragilidad) {
        this.nivelFragilidad = nivelFragilidad;
    }
    
    public double calcularCostoFinal() throws FragilidadInvalidaException {
        if (nivelFragilidad > 3 || nivelFragilidad < 1) {
            throw new FragilidadInvalidaException("El nivel de fragilidad debe ser 1, 2 o 3.");
        }
        return super.calcularCostoFinal() * (1 + (nivelFragilidad - 1) * 0.1);
    }
}
 
}
