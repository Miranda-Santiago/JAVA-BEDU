package muestras;
import java.util.*;

public class Registromuestras {
    public static void main(String[] args) {
        // - Registro del orden de las muestras
        ArrayList<String> Muestras = new ArrayList<>();
        // - Especies
        Muestras.add("Homo sapiens");
        Muestras.add("Mus musculus");
        Muestras.add("Arabidopsis thaliana");
        Muestras.add("Homo sapiens");
        System.out.println("- Orden de muestras recibidas: ");
        for (int i = 0; i < Muestras.size(); i++) {
            System.out.println((i + 1) + ". " + Muestras.get(i));
        }
        // - HashSet para especies únicas
        HashSet<String> unique = new HashSet<>(Muestras);
        System.out.println("\n- Lista de especies únicas:");
        for (String especie : unique) {
            System.out.println("- " + especie);
        }
        // - HashMap
        HashMap<String, String> investigador= new HashMap<>();
        //  ID de muestra y nombre del investigador
        investigador.put("M-001", "Dra. Meza");
        investigador.put("M-002", "Dr. Ross");
        investigador.put("M-003", "Dr. Kavanagh");

        System.out.println("\n- Asignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : investigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        //- Búsqueda de investigador por ID de muestra
        String idBuscar = "M-003"; // Puedes cambiar este valor si lo deseas
        System.out.println("- Investigador responsable de la muestra " + idBuscar + ": " + investigador.get(idBuscar));
    }
}
