package reservas_vuelo;

public class Main {
    public static void main(String[] args) {
        // - Nuevo pasajero
        Pasajero pasajero = new Pasajero("Miranda Santiago", "MZ18663");
        // - Nuevo vuelo
        Vuelo vuelo = new Vuelo("MX543", "CANCÚN", "12:30");
        // - Reservar asiento
        boolean reservado =  vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅- Reserva realizada con éxito.");
        } else {
            System.out.println("❌- No se pudo realizar la reserva.");
        }
        // - Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("Cancelando reserva...");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Nueva reservacion
        vuelo.reservarAsiento("José Alfredo", "JP1302");
        System.out.println(vuelo.obtenerItinerario());
    }
}
