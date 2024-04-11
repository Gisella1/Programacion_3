
package com.mycompany.diccionariojava;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class DiccionarioJava {

    public static void main(String[] args) {
        //Crea un diccionario vacío llamado perro
        Dictionary perro = new Hashtable();
        
        // Añade nombre, color, raza, patas y edad al diccionario perro 
        perro.put("name", "Pluto");
        perro.put("color", "negro");
        perro.put("raza", "pincher");
        perro.put("patas", "4");
        perro.put("edad", "2");
        
        //Crea un diccionario de estudiante y añade nombre, apellido, sexo, edad, estado civil, habilidades, país, ciudad y dirección como claves del diccionario
        Dictionary estudiante = new Hashtable();
        ArrayList <String> p = new ArrayList();
        p.add("bailar");
        p.add("piloto");
        
        estudiante.put("name", "kelly");
        estudiante.put("apellido", "Duarte");
        estudiante.put("sexo", "Femenino");
        estudiante.put("edad", 20);
        estudiante.put("estado sivil", "Casada");
        estudiante.put("habilidades", p);
        estudiante.put("pais", "USA");
        estudiante.put("ciudad", "New York");
        estudiante.put("direccion", "la novena #123-12");
        
        //Obtén la longitud del diccionario del alumno
        int longitud = estudiante.size();
        System.out.println("la longitud es:" + longitud);
        
        //Obtenga el valor de las habilidades y compruebe el tipo de datos, debe ser una lista
        String valor = (String) estudiante.get ("habilidades");
        
        //Modifique los valores de las habilidades añadiendo una o dos habilidades.
        p.add("java");
        p.add("python");
        
        //Obtener las claves del diccionario como una lista
        //Obtener los valores del diccionario como una lista
        //Cambie el diccionario a una lista de tuplas utilizando el método items()
        
        //Eliminar uno de los elementos del diccionario
        estudiante.remove("ciudad");
        System.out.println("los nuevos valores son:" + estudiante);
        
        //Borrar uno de los diccionarios
       estudiante.clear();
        
    }
}
