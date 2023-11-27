// Paso 1: Crear la clase base
interface Animal {
    String describir();
}

class Perro implements Animal {
    @Override
    public String describir() {
        return "Soy un perro";
    }
}

class Gato implements Animal {
    @Override
    public String describir() {
        return "Soy un gato";
    }
}

// Paso 2: Crear el decorador abstracto
abstract class DecoradorAnimal implements Animal {
    protected Animal animalDecorado;

    public DecoradorAnimal(Animal animal) {
        this.animalDecorado = animal;
    }

    public String describir() {
        return animalDecorado.describir();
    }
}

// Paso 3: Crear decoradores concretos
class ConCollar extends DecoradorAnimal {
    public ConCollar(Animal animal) {
        super(animal);
    }

    @Override
    public String describir() {
        return super.describir() + ", y tengo un collar";
    }
}

class ConRopa extends DecoradorAnimal {
    public ConRopa(Animal animal) {
        super(animal);
    }

    @Override
    public String describir() {
        return super.describir() + ", y llevo ropa";
    }
}

// Clase para demostrar el uso del patrón Decorator
public class Decorator implements Patron {
    @Override
    public void ejecutarEjemplo(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();

        Animal perroConCollar = new ConCollar(perro);
        Animal gatoConRopa = new ConRopa(gato);

        System.out.println(perroConCollar.describir());
        System.out.println(gatoConRopa.describir());
    }
}
