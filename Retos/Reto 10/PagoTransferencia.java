package sistema_pago;

public class PagoTransferencia extends Metodopago{
    private boolean valido;
    public PagoTransferencia(double monto, boolean valido){
        super(monto);
        this.valido = valido;

    }
    @Override
    public boolean autenticar() {
        return valido;
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia por $" + monto);
    }
}


