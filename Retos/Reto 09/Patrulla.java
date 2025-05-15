package unidades_emergencia;

public class Patrulla extends UnidadEmergencia{
    // - Clases auxiliares
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;
    // - Constructor
    public Patrulla(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }
    // - Componentes por composición
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("🚓 Patrulla atendiendo situación de seguridad ciudadana.");
    }
}
