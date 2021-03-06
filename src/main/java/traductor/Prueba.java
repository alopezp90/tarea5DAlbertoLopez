package traductor;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Prueba {

    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();
//        Diccionario diccionario = new Diccionario("src/main/resources/listadoOriginal.txt");//Usa listado de 1000 palabras

        //Añade 10 traducciones al diccionario
        diccionario.guardarEntrada("have", "tener");
        diccionario.guardarEntrada("would", "haria");
        diccionario.guardarEntrada("give", "dar");
        diccionario.guardarEntrada("sentence", "frase");
        diccionario.guardarEntrada("too", "tambien");
        diccionario.guardarEntrada("tell", "contar");
        diccionario.guardarEntrada("old", "antiguo");
        diccionario.guardarEntrada("right", "derecho");
        diccionario.guardarEntrada("left", "izquierdo");
        diccionario.guardarEntrada("small", "pequeña");

        //traduce una palabra
        System.out.println("small: " + diccionario.traducir("small"));

        //borra una traduccion
        diccionario.borrarEntrada("give");

        //modifica una traduccion
        diccionario.modificarEntrada("small", "pequeño");

        //imprime listado de Keys
        for (String key : diccionario.listadoKeys()) {
            System.out.println(key);
        }

        //imprime listado de Values
        for (String value : diccionario.listadoValues()) {
            System.out.println(value);
        }
    }
}
