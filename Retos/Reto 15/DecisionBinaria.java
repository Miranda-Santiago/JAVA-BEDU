package videojuego;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision{
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?");
        System.out.println("A: Deseas escoger la invisibilidad");
        System.out.println("B: Deseas escoger super fuerza");
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}
