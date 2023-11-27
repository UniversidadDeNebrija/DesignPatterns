// Paso 1: Crear la interfaz Transporte
interface Transporte {
    void operar();
}

// Paso 2: Crear clases concretas que implementan la interfaz Transporte
class Camion implements Transporte {
    @Override
    public void operar() {
        System.out.println("Operando un camión");
    }
}

class Barco implements Transporte {
    @Override
    public void operar() {
        System.out.println("Operando un barco");
    }
}

// Paso 3: Crear la clase Factory
class TransporteFactory {

    public Transporte crearTransporte(String tipo) {
        if (tipo == null || tipo.isEmpty())
            return null;
        if ("CAMION".equals(tipo.toUpperCase())) {
            return new Camion();
        } else if ("BARCO".equals(tipo.toUpperCase())) {
            return new Barco();
        }

        return null;
    }
}

// Clase para demostrar el uso del Factory Method
public class FactoryMethod implements Patron {
    @Override
    public void ejecutarEjemplo(String[] args) {
        TransporteFactory factory = new TransporteFactory();

        Transporte transporte1 = factory.crearTransporte("camion");
        transporte1.operar();

        Transporte transporte2 = factory.crearTransporte("barco");
        transporte2.operar();
    }
}
