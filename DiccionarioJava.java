package diccionario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class Diccionario {
public static void main(String[] args) {
    
//1. Crea un diccionario vacío llamado perro
Dictionary perro = new Hashtable();

//2. Añade nombre, color, raza, patas y edad al diccionario perro.
perro.put("nombre", "pluto");
perro.put("color", "negro");
perro.put("raza", "pincher");
perro.put("patas", "4");
perro.put("edad", "2 años");

//*3. Crea un diccionario de estudiante y añade nombre, apellido, sexo, edad, estado civil, habilidades, país, ciudad y dirección como claves del diccionario
Map estudiante = new Hashtable();
ArrayList p = new ArrayList();
p.add("python");
p.add("java");

estudiante.put("nombre", "ana");
estudiante.put("apellido", "perez");
estudiante.put("sexo", "femenino");
estudiante.put("edad", "22");
estudiante.put("estado_civil", "casada");
estudiante.put("habilidades", p.toString());
estudiante.put("pais", "usa");
estudiante.put("ciudad", "nueva york");
estudiante.put("direccion", "la quinta");

//4. Obtén la longitud del diccionario del alumno
int longitud = estudiante.size();
System.out.println("la longitud es: " + longitud);

//5. Obtenga el valor de las habilidades y compruebe el tipo de datos, debe ser una lista
System.out.println("Tamano del dict: "+ estudiante.get("habilidades"));

//6. Modifique los valores de las habilidades añadiendo una o dos habilidades.
p.add("baila");
p.add("modelo");
estudiante.put("habilidades", p.toString());

//10. Eliminar uno de los elementos del diccionario
estudiante.remove("apellido");
System.out.println("los nuevos valores son: " + estudiante );

//11. Borrar uno de los diccionarios
estudiante.clear();

  }
}
