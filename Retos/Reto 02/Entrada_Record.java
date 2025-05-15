package evento;

public record Entrada_Record(String evento, double precio) {
    public void mostrarInformacion(){
        System.out.println("--------------¡Bienveni@!----------------");
        System.out.println("-------------🎫 Entrada 🎫--------------");
        System.out.println("Evento: " + evento + "| Precio de la entrada: " + precio);}


}
