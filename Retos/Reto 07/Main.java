package sistemacontable;

public class Main {
    public static void main(String[] args) {
        // - Nuevas facturas
        Factura factura1 = new Factura("FAC001","Juan Pérez",1450.0);
        Factura factura2 = new Factura("FAC001","Comercial XYZ",1450);
        // - Mostrar en pantalla
        System.out.println(factura1);
        System.out.println(factura2);
        // - Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + factura1.equals(factura2));
    }
}
