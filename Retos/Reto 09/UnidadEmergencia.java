package unidades_emergencia;

public abstract class UnidadEmergencia {
    String nombre;
    // - Método
    public UnidadEmergencia(String nombre){
        this.nombre = nombre;
    }
    // - Método concreto de activación
    public void activarUnidad(){
        System.out.println("🚨 Activando unidad: " + nombre);
    }
    // - Método abstracto
    public abstract void responder();
}
