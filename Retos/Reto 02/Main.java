package evento;

public class Main {
    public static void main(String[] args) {
        // - Objeto
        Entrada entrada1 = new Entrada("Concierto de The Weeknd",2500);
        Entrada entrada2 = new Entrada("Concierto de Lorde",2300);
        // - Mostrar info
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        // - Reto adicional record
        Entrada_Record  entrada3 = new Entrada_Record("Concierto de Post Malone",1500);

        entrada3.mostrarInformacion();

    }
}
