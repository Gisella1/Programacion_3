

package vectorejava;


import java.util.ArrayList;
import java.util.Collections;

public class VectoreJava {

    public static void main(String[] args) {
        // 1. 
        ArrayList<String> listaVacia = new ArrayList<>();

        // 2. 
        ArrayList<Integer> listaConElementos = new ArrayList<>();
        listaConElementos.add(25);
        listaConElementos.add(30);
        listaConElementos.add(35);
        listaConElementos.add(40);
        listaConElementos.add(45);

        // 3. 
        int longitudListaVacia = listaVacia.size();
        int longitudListaConElementos = listaConElementos.size();
        System.out.println("Longitud de listaVacia: " + longitudListaVacia);
        System.out.println("Longitud de listaConElementos: " + longitudListaConElementos);

        // 4. 
        int primerElemento = listaConElementos.get(0);
        int elementoCentral = listaConElementos.get(listaConElementos.size() / 2);
        int ultimoElemento = listaConElementos.get(listaConElementos.size() - 1);
        System.out.println("Primer elemento: " + primerElemento);
        System.out.println("Elemento central: " + elementoCentral);
        System.out.println("Último elemento: " + ultimoElemento);

        // 5. 
        ArrayList<String> datosPersonales = new ArrayList<>();
        datosPersonales.add("John Doe");
        datosPersonales.add("30");
        datosPersonales.add("180 cm");
        datosPersonales.add("Soltero");
        datosPersonales.add("123 Calle Principal");

        // 6. 
        ArrayList<String> itCompanies = new ArrayList<>();
        itCompanies.add("Facebook");
        itCompanies.add("Google");
        itCompanies.add("Microsoft");
        itCompanies.add("Apple");
        itCompanies.add("IBM");
        itCompanies.add("Oracle");
        itCompanies.add("Amazon");

        // 7. 
        itCompanies.add(1, "instagram");

        // 8. 
        boolean existeEmpresa = itCompanies.contains("Microsoft");
        System.out.println("¿Existe Microsoft en la lista? " + existeEmpresa);

        // 9. 
        Collections.sort(itCompanies);
        System.out.println("Lista it_companies ordenada: " + itCompanies);

        // 10. 
        Collections.reverse(itCompanies);
        System.out.println("Lista it_companies invertida: " + itCompanies);

        // 11. 
        itCompanies.remove(0);

        // 12. 
        itCompanies.clear();
        System.out.println("Lista it_companies después de borrar todas las empresas: " + itCompanies);
    }
}

