package videojuego;

public class DialogoTexto implements GestorDialogo{
    public void mostrarDialogo(Narrador paquete) {
        System.out.println("- Escena actual: " + paquete.getEscenaActual());
        System.out.println("- Villano: Estás a punto de caer soldado, sal de tu escondite!");
    }
}
