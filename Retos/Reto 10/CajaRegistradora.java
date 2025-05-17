package sistema_pago;

public class CajaRegistradora {
    public static void main(String[] args) {
        Metodopago[] pagos = {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(250.0, false) // esta fallará en autenticación
        };

        for (Metodopago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("✅ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}
