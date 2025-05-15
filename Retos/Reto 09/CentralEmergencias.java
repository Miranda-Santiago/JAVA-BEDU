package unidades_emergencia;

public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia1 = new Ambulancia("Ambulancia", "Miranda");
        Patrulla patrulla1 = new Patrulla("Patrulla", "Denise");
        UnidadBomberos bomberos1 = new UnidadBomberos("UnidadBomberos", "Silvia");

        ambulancia1.iniciarOperacion();
        System.out.println();

        patrulla1.iniciarOperacion();
        System.out.println();

        bomberos1.iniciarOperacion();
    }
}
