package Reto06;

public class Main {
    public static void main(String[] args) {
        // - Nuevas facturas
        Factura factura1 = new Factura(2500,"Servicio de consultoría","ABCC010101XYZ");
        Factura factura2 = new Factura(1800.0,"Reparación de equipo",null);
        // - Mostrar info
        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());

    }
}
