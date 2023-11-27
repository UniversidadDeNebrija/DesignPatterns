// Paso 1: Crear la interfaz de Estado
interface EstadoRobot {
    void actuar();
}

// Paso 2: Crear estados concretos
class EstadoAmigable implements EstadoRobot {
    @Override
    public void actuar() {
        System.out.println("El robot actúa de manera amigable.");
    }
}

class EstadoViolento implements EstadoRobot {
    @Override
    public void actuar() {
        System.out.println("El robot actúa de manera violenta.");
    }
}

// Paso 3: Crear el contexto
class Robot {
    private EstadoRobot estadoActual;

    public Robot() {
        this.estadoActual = new EstadoAmigable(); // Estado por defecto
    }

    public void setEstado(EstadoRobot estado) {
        this.estadoActual = estado;
    }

    public void actuar() {
        estadoActual.actuar();
    }
}

// Clase para demostrar el uso del patrón State
public class State implements Patron {
    @Override
    public void ejecutarEjemplo(String[] args) {
        Robot robot = new Robot();

        // El robot actúa de manera amigable
        robot.actuar();

        // Cambiar al estado violento
        robot.setEstado(new EstadoViolento());

        // Ahora el robot actúa de manera violenta
        robot.actuar();

        // Volver al estado amigable
        robot.setEstado(new EstadoAmigable());

        // El robot actúa de manera amigable nuevamente
        robot.actuar();
    }
}
