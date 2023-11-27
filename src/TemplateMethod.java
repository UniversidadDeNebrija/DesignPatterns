// Paso 1: Crear la clase abstracta
abstract class AtaqueEstado {

    // Método template para realizar un ataque
    public final void realizarAtaque() {
        aplicarEfecto();
        mostrarEfecto();
        aplicarDañoAdicional();
    }

    // Métodos abstractos que las subclases deben implementar
    abstract void aplicarEfecto();
    abstract void mostrarEfecto();

    // Método concreto (opcional)
    void aplicarDañoAdicional() {
        // Daño adicional por defecto (puede ser sobrescrito)
        System.out.println("Daño adicional aplicado.");
    }
}

// Paso 2: Crear clases concretas
class AtaqueEnvenenamiento extends AtaqueEstado {
    @Override
    void aplicarEfecto() {
        System.out.println("Envenenamiento aplicado.");
    }

    @Override
    void mostrarEfecto() {
        System.out.println("El enemigo está envenenado.");
    }
}

class AtaqueCongelamiento extends AtaqueEstado {
    @Override
    void aplicarEfecto() {
        System.out.println("Congelamiento aplicado.");
    }

    @Override
    void mostrarEfecto() {
        System.out.println("El enemigo está congelado.");
    }

    @Override
    void aplicarDañoAdicional() {
        System.out.println("Daño adicional por congelamiento aplicado.");
    }
}

// Clase para demostrar el uso del patrón Template Method
public class TemplateMethod implements Patron {
    @Override
    public void ejecutarEjemplo(String[] args) {
        AtaqueEstado envenenamiento = new AtaqueEnvenenamiento();
        AtaqueEstado congelamiento = new AtaqueCongelamiento();

        System.out.println("Ataque con envenenamiento:");
        envenenamiento.realizarAtaque();

        System.out.println("\nAtaque con congelamiento:");
        congelamiento.realizarAtaque();
    }
}
