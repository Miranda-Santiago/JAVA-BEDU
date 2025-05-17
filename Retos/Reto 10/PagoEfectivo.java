package sistema_pago;

public class PagoEfectivo extends Metodopago{
    // - Constructor
    public PagoEfectivo(double monto){
        super(monto); // - Llama a la
    }

    @Override
    public boolean autenticar() {
        return true;
    }

    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
