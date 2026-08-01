import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransitManager {
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
