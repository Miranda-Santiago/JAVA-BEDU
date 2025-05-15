package reservas_vuelo;

public class Vuelo {
   // - Atributos
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado; //- Referencia al pasajero que reservó el asiento

    // - Método vuelo: constructor del vuelo
    public Vuelo(String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino     = destino;
        this.horaSalida  =  horaSalida;
    }

    // - Método reservar asiento: asigna al pasajero si no hay reserva previa
    public boolean reservarAsiento (Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    // - Método sobrecargado
     public boolean reservarAsiento(String nombre, String pasaporte) {
      Pasajero nuevoPasajero = new Pasajero(nombre,pasaporte);
      return reservarAsiento(nuevoPasajero);
    }
    // - Método elimina al pasajero asignado
    public void cancelarReserva() {
        asientoReservado = null;
    }
    // Mostrar info del vuelo y pasajero
    public String obtenerItinerario (){
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}
