package Farmacia;

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        // - Objeto
        Scanner scanner = new Scanner(System.in);
        // - Compra
        System.out.println("💊 - Introduce el nombre del medicamento: ");
        String medicamento = scanner.nextLine();
        System.out.println("💲 - Introduce el precio unitario:  ");
        double precio = scanner.nextDouble();
        System.out.println("🛒- Introduce la cantidad de piezas: ");
        int piezas = scanner.nextInt();
        // - Total de la compra
        double total = (piezas * precio);
        // - ¿Aplica el descuento?
        var aplicadescuento = total > 500;
        // - Asignación del descuento 15%
        double descuento = aplicadescuento ? total * 0.15 : 0;
        // total
        double totalfinal = total - descuento;
        System.out.println("\nResumen de compra:");
        System.out.println(" - Total de la compra: $" + total);
        System.out.println(" - ¿Aplica descuento? " + aplicadescuento);
        System.out.println(" - Descuento aplicado: $" + descuento);
        System.out.println("💳 - Total a pagar: $" +totalfinal);

        scanner.close();


    }

}
