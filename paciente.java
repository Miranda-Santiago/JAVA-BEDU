package Reto_01;
public class paciente {
    // Atributos del usuario
    String nombre;
    int edad;
    String no_expediente;
    // Metodo mostrar info en consola
    public void mostrarInfo() {
        System.out.println("👤 Datos del paciente: ");
        System.out.println("Nombre del paciente: " + nombre);
        System.out.println("Edad del paciente: " + edad);
        System.out.println("📁 No. de expediente: " + no_expediente);

    }

}