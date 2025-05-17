package videojuego;

public class MainNarrativa {
    public static void main(String[] args) {
        // -Flujo de una escena narrativa
      Narrador paquete = new Narrador("Necesitas elegir un poder del cual depende tu camino");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}
