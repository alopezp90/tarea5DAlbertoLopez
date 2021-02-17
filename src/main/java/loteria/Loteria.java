package loteria;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Loteria {
    
    private Map<String, Integer> listadoPremios;
    
    public Loteria() {
        listadoPremios = new HashMap<>();
       
    }
    
    public void addPremio(String decimo, Integer premio) {
        this.listadoPremios.put(decimo,premio);
    }
    
    public Integer consulta(String decimo) {
        return this.listadoPremios.get(decimo);
    }

    public Map<String, Integer> getListadoPremios() {
        return listadoPremios;
    }
}
