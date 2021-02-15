package domino;

import java.util.ArrayList;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class Prueba {

    public static void main(String[] args) {
        
        //Inicializa el set
        Domino domino = new Domino();
        
        System.out.println("Cuantas fichas de domino hay:");
        System.out.println(domino.cantidadFichas());
        System.out.println("-----------------------------");
        
        System.out.println("Saca el 6 doble.");
        domino.sacarUna(new FichaDomino(6, 6));
        System.out.println("Ahora hay " + domino.cantidadFichas() + " fichas.");
        System.out.println("-----------------------------");
        
        System.out.println("Vuelve a sacar el 6 doble.");
        domino.sacarUna(new FichaDomino(6, 6));
        System.out.println("Ahora hay " + domino.cantidadFichas() + " fichas.");
        System.out.println("-----------------------------");
        
        System.out.println("Introduce el 5 doble.(ya estaba)");
        domino.addFicha(new FichaDomino(5, 5));
        System.out.println("Ahora hay " + domino.cantidadFichas() + " fichas.");
        System.out.println("-----------------------------");
        
        System.out.println("Introduce el 6 doble.");
        domino.addFicha(new FichaDomino(6, 6));
        System.out.println("Ahora hay " + domino.cantidadFichas() + " fichas.");
        System.out.println("-----------------------------");
        
        System.out.println("Saca todas las fichas a una Lista");
        ArrayList<FichaDomino> lista = domino.sacarTodas();
        System.out.println("Ahora hay " + domino.cantidadFichas() + " fichas.");
        System.out.println("La lista de fichas es:");
        for(FichaDomino f : lista) {
            System.out.println(f.toString());
        }
        System.out.println("----------------------------");
        
        System.out.println("Hay fichas en el set?");
        System.out.println(domino.hayFichas());
        System.out.println("----------------------------");
        
    }
}
