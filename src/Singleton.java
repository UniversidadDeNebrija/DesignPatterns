// Paso 1: Crear la clase Singleton para el HUD
class HUD {

    // La instancia única
    private static HUD instancia = new HUD();

    // Variables de ejemplo para el estado del HUD
    private int salud;
    private int municion;
    private String mapa;

    // Constructor privado para prevenir instanciación
    private HUD() {
        // Inicializar variables con valores predeterminados
        salud = 100;
        municion = 50;
        mapa = "MapaInicial";
    }

    // Método estático para obtener la instancia
    public static HUD obtenerInstancia() {
        return instancia;
    }

    // Métodos de ejemplo para operar el HUD
    public void mostrarEstado() {
        System.out.println("Salud: " + salud + ", Munición: " + municion + ", Mapa: " + mapa);
    }

    // Métodos para modificar el estado del HUD
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    // Otros métodos relacionados con el HUD...
}

// Clase para demostrar el uso del Singleton
public class Singleton implements Patron {
    @Override
    public void ejecutarEjemplo(String[] args) {
        // Obtener la instancia del HUD
        HUD hud = HUD.obtenerInstancia();

        // Mostrar el estado inicial del HUD
        hud.mostrarEstado();

        // Modificar el estado del HUD
        hud.setSalud(80);
        hud.setMunicion(30);

        // Mostrar el estado modificado del HUD
        hud.mostrarEstado();
    }
}
