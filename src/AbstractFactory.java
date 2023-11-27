// Paso 1: Crear interfaces de productos
interface Sofa {
    void describir();
}

interface Silla {
    void describir();
}

interface MesaDeCafe {
    void describir();
}

// Paso 2: Crear clases concretas de productos
// Sofás
class SofaVictoriano implements Sofa {
    public void describir() { System.out.println("Sofá Victoriano"); }
}

class SofaArtDeco implements Sofa {
    public void describir() { System.out.println("Sofá Art Deco"); }
}

class SofaModerno implements Sofa {
    public void describir() { System.out.println("Sofá Moderno"); }
}

// Sillas
class SillaVictoriana implements Silla {
    public void describir() { System.out.println("Silla Victoriana"); }
}

class SillaArtDeco implements Silla {
    public void describir() { System.out.println("Silla Art Deco"); }
}

class SillaModerna implements Silla {
    public void describir() { System.out.println("Silla Moderna"); }
}

// Mesas de café
class MesaDeCafeVictoriana implements MesaDeCafe {
    public void describir() { System.out.println("Mesa de Café Victoriana"); }
}

class MesaDeCafeArtDeco implements MesaDeCafe {
    public void describir() { System.out.println("Mesa de Café Art Deco"); }
}

class MesaDeCafeModerna implements MesaDeCafe {
    public void describir() { System.out.println("Mesa de Café Moderna"); }
}

// Paso 3: Crear la interfaz de la fábrica abstracta
interface FabricaDeMuebles {
    Sofa crearSofa();
    Silla crearSilla();
    MesaDeCafe crearMesaDeCafe();
}

// Paso 4: Crear fábricas concretas
class FabricaDeMueblesVictorianos implements FabricaDeMuebles {
    public Sofa crearSofa() { return new SofaVictoriano(); }
    public Silla crearSilla() { return new SillaVictoriana(); }
    public MesaDeCafe crearMesaDeCafe() { return new MesaDeCafeVictoriana(); }
}

class FabricaDeMueblesArtDeco implements FabricaDeMuebles {
    public Sofa crearSofa() { return new SofaArtDeco(); }
    public Silla crearSilla() { return new SillaArtDeco(); }
    public MesaDeCafe crearMesaDeCafe() { return new MesaDeCafeArtDeco(); }
}

class FabricaDeMueblesModernos implements FabricaDeMuebles {
    public Sofa crearSofa() { return new SofaModerno(); }
    public Silla crearSilla() { return new SillaModerna(); }
    public MesaDeCafe crearMesaDeCafe() { return new MesaDeCafeModerna(); }
}

// Clase para demostrar el uso del patrón Abstract Factory
public class AbstractFactory implements Patron {
    @Override
    public void ejecutarEjemplo(String[] args) {
        FabricaDeMuebles fabrica = new FabricaDeMueblesModernos();

        Sofa sofa = fabrica.crearSofa();
        sofa.describir();

        Silla silla = fabrica.crearSilla();
        silla.describir();

        MesaDeCafe mesa = fabrica.crearMesaDeCafe();
        mesa.describir();

        // Cambio de fábrica a estilo Victoriano
        fabrica = new FabricaDeMueblesVictorianos();

        sofa = fabrica.crearSofa();
        sofa.describir();

        silla = fabrica.crearSilla();
        silla.describir();

        mesa = fabrica.crearMesaDeCafe();
        mesa.describir();
    }
}