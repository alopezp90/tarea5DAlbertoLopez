package traductor;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

//fantasia
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Diccionario {

    private SortedMap<String, String> diccionario;

    public Diccionario() {
        this.diccionario = new TreeMap<>();
    }

    public void guardarEntrada(String palabraIngles, String palabraEspanol) {
        this.diccionario.put(palabraIngles, palabraEspanol);
    }

    public void borrarEntrada(String palabraIngles) {
        this.diccionario.remove(palabraIngles);
    }

    public void modificarEntrada(String palabraIngles, String nuevaPalabraEspanol) {
        this.diccionario.replace(palabraIngles, nuevaPalabraEspanol);
    }

    public String traducir(String palabraIngles) {
        return this.diccionario.get(palabraIngles);
    }

    public ArrayList<String> listadoKeys() {
        return new ArrayList<String>(this.diccionario.keySet());
    }

    public ArrayList<String> listadoValues() {
        return new ArrayList<String>(this.diccionario.values());
    }

    //HASTA AQUI EL EJERCICIO DE CLASE. LO QUE SIGUE ES UNA MEJORA, INTRODUCIENDO
    //COMO DICCIONARIO UN LISTADO DE LAS 1000 PALABRAS MAS USADAS EN INGLES
    public Diccionario(String ruta) {
        this.diccionario = new TreeMap<>();
        
        Charset charset = Charset.forName("UTF-8");
        Path path = FileSystems.getDefault().getPath(ruta);
        
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                //quita la primera columna (indice)
                line = line.substring(line.indexOf("\t") + 1);
                
                //split en el tabulador y crea la entrada con las columnas 2 y 3
                String[] traduccion = line.split("\t");
                guardarEntrada(traduccion[0], traduccion[1]);
            }
            
        } catch (IOException ioe) {
            System.out.println("Algo ha salido mal");
        }
    }

}
