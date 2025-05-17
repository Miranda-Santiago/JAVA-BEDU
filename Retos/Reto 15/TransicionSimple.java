package videojuego;

public class TransicionSimple implements TransicionHistoria{
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("- Genial el villano no te ha visto, pero sus secuaces te descubrieron cuando se agotó tu tiempo de invisibilidad");
        } else {
            System.out.println("- Tu super fuerza te ha dado ventaja, por el momento el villano tiene un poder mínimo. ¡Atacaaa!");
        }
    }
}
