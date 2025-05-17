package planeacion;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        // - Lista concurrente de temas -> CopyOnWriteArrayList
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Club de lectura", 3));
        temas.add(new Tema("Matemáticas avanzadas", 1));
        temas.add(new Tema("Ciencias de la salud", 2));

        // - Orden de temas alfabéticamente -> Comparable
        Collections.sort(temas);
        System.out.println("- Temas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // - Orden de temas por prioridad -> Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("\n- Temas ordenados por prioridad: ");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // - Mapa concurrente de recursos usando ConcurrentHashMap
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Club de lectura", "https://recursos.educacion/club-lectura");
        recursos.put("Matemáticas avanzadas", "https://recursos.educacion/mates");
        recursos.put("Ciencias de la salud", "https://recursos.educacion/salud");

        // - Repositorio
        System.out.println("\n- Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " → " + recursos.get(tema));
        }
    }

    private static String getString() {
        return " comprensiva";
    }
}
