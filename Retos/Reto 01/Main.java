package Reto_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // - Objeto tipo paciente
        paciente paciente1 = new paciente();
        // - Solicitar info del paciente
        System.out.println("¡Bienvenid@!👤");
        System.out.print("Ingresa el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();
        System.out.print("Ingresa la edad: ");
        paciente1.edad   = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingresa el número de expediente: ");
        paciente1.no_expediente= scanner.nextLine();
        // - Llamar metodo y mostrar datos
        paciente1.mostrarInfo();
        // - Cerrar scanner
        scanner.close();
    }
}
