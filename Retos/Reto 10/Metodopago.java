package sistema_pago;

public abstract class Metodopago implements Autenticable{
    // - Atributo
    protected double monto;
    //- Constructor
    public Metodopago(double monto){
        this.monto = monto;
    }
    public abstract void procesarPago();
    public void mostrarResumen(){
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
