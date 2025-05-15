package sistemacontable;

public class Factura {
    // - Atributos
    String folio;
    String cliente;
    double total;
    // - Constructor para inicializar parámetros
    public Factura(String folio, String cliente, double total){
        this.folio   = folio;
        this.cliente = cliente;
        this.total   = total;
    }
    // - Método para mostrar info de la factura con formato
    @Override
    public String toString() {
        return "🧾 Factura [Folio= " + folio+ " Cliente= " + cliente + " Total=$ " + total+ "]";
    }
    // - Método equals: comparar si dos facturas tienen el mismo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }
    // - Método hascode() basado en el  folio
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
