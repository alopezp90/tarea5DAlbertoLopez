package loteria;

import java.util.Random;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Prueba {

    private static Random rd = new Random();

    public static void main(String[] args) {
        final int PREMIO_MAXIMO = 4000000;
        final int DIGITOS = 5;

        Loteria loteria = new Loteria();
        String aux;
        for (int i = 0; i < 1000; i++) {
            aux = "";
            for (int j = 0; j < DIGITOS; j++) {
                aux += rd.nextInt(10);
            }
            loteria.addPremio(aux, rd.nextInt(PREMIO_MAXIMO));
        }
        //Comprueba un numero, va a dar null casi siempre
        System.out.println("Premio del 12345: " + loteria.consulta("12345") + "€");

        //Consultamos uno que exista
        String decimoExistente = loteria.getListadoPremios().keySet().toArray()[0].toString();                  

        System.out.println("Premio del " + decimoExistente + ": " 
                + loteria.consulta(decimoExistente) + "€");
    }
}
