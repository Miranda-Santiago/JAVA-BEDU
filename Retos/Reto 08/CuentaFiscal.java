package declaraciones_impuestos;

import java.util.Objects;

public class CuentaFiscal {
    // - Atributos
    private String rfc;
    private double saldoDisponible;
    //- Constructor
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        // - Validación para que el saldo no sea negativo
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("- El saldo no puede ser negativo. Se asignará 0.");
            this.saldoDisponible = 0;
        }
    }
        // - Getters
        public String getRfc() {
            return rfc;
        }
        public double getSaldoDisponible() {
            return saldoDisponible;
        }
        // - Método para validar RFC
        public boolean validarRFC(DeclaracionImpuestos d) {
            return Objects.equals(this.rfc, d.rfcContribuyente());
        }
        // - Mostrar info
        public void mostrarCuenta() {
            System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
        }
    }

