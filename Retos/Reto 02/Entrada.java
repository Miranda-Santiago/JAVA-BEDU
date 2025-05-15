package evento;

public class Entrada {
    // - Atributos de la entrada del evento
    String evento;
    double precio;
    // - Constructor para inicializar atributos
    // - this.evento se refiere al atributo de la clase
    // - evento es el parámetro que se recibe
    public Entrada(String evento, double precio){
        this.evento = evento;
        this.precio = precio;
    }
    // Metodo
    public void mostrarInformacion(){
        System.out.println("--------------¡Bienveni@!----------------");
        System.out.println("-------------🎫 Entrada 🎫--------------");
        System.out.println("Evento: " + evento + "| Precio de la entrada: " + precio);
}
}
