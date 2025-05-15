package Reto06;

import java.util.Optional;

public class Factura {
    private double monto; // - Cantidad total de lo facturado
    private String descripcion;// - Concepto de lo facturado
    private Optional<String>rfc;
    // - Métodos públicos
    public Factura(double monto, String descripcion,String rfc){
        this.monto = monto;
        this. descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }
    //
    public String getResumen(){
        String resumen = "Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // Si el RFC está presente, se muestra. Si no, se muestra mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
