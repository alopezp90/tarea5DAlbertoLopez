package domino;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Domino {

    private Set<FichaDomino> setDomino;

    public Domino() {
        setDomino = new HashSet<>();
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                setDomino.add(new FichaDomino(i, j));
            }
        }
    }
    
    public int cantidadFichas() {
        return this.setDomino.size();
    }
    
    public void addFicha(FichaDomino f) {
        if(!this.setDomino.add(f)){
            System.out.println("La ficha ya estaba en el Set.");
        }
    }
    
    public boolean hayFichas() {
        return !this.setDomino.isEmpty();
    }
    
    public boolean contains(FichaDomino f) {
        return this.setDomino.contains(f);
    }
    
    public ArrayList<FichaDomino> sacarTodas() {
        ArrayList<FichaDomino> todas = new ArrayList<>();
        for (FichaDomino f : this.setDomino) {
            todas.add(f);
        }
        this.setDomino.clear();
        return todas;       
    }
    
    public void sacarUna(FichaDomino f) {
        if(!this.setDomino.remove(f)) {
            System.out.println("La ficha no estaba contenida en el Set.");
        }
    }
}
