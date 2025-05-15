package cajero;
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // - Objeto
        Scanner scanner = new Scanner(System.in);
        var saldo = 200; // - Saldo inicial
        int opcion;     //  - Variable almacenamiento
        do{
            // Menú
            System.out.println("- Bienvenid@ al cajero automático Santiago");
            System.out.println("- ¿Qué movimiento desea realizar?");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero ");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1 ->{
                    System.out.println("Tu saldo actual es: $" + saldo);
                    }
                case 2 ->{
                    System.out.println("¿Cuánto dinero deseas depositar?");
                    double deposito = scanner.nextDouble();
                    if (deposito<0) {
                        System.out.println("El monto debe ser mayor a 0");
                        continue;
                    }
                    saldo += deposito; // Almacena el dinero
                    System.out.println("✅ Depósito realizado - Saldo actualizado: $" + saldo);
                    }
                case 3 ->{
                    System.out.println("¿Cuánto dinero deseas retirar?: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= 0){
                        System.out.println("⚠- El monto debe ser mayor a 0");
                        continue;
                    }
                    if (retiro > saldo) {
                        System.out.println("⚠ Saldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; // Resta el monto del saldo
                        System.out.println("✅ Retiro exitoso");
                        System.out.println("Saldo restante: $" + saldo);

                    }
                }
                case 4-> {
                    System.out.println("¡Gracias! Hasta pronto:)");
                }
                default -> {
                // Opción no válida
                 System.out.println("🚫 Opción inválida. Intenta de nuevo.");
                }
            }

        }while (opcion != 4);
    scanner.close();
    }
}
