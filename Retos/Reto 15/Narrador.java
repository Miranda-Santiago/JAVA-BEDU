package videojuego;

public class Narrador {
    private String escenaActual;

    public Narrador(String escenaActual) {
        this.escenaActual = escenaActual;
    }

    public String getEscenaActual() {
        return escenaActual;
    }

    public void setEscenaActual(String nuevaEscena) {
        this.escenaActual = nuevaEscena;
    }
}
