import java.util.Arrays;
import java.util.List;

interface Patron {
    void ejecutarEjemplo(String[] args);
}

public class Main {
    public static void main(String[] args) {

        List<Patron> patrones = Arrays.asList(
                new FactoryMethod(),
                new AbstractFactory(),
                new Singleton(),
                new Adapter(),
                new Decorator(),
                new State(),
                new TemplateMethod()
        );

        for (Patron patron : patrones) {
            patron.ejecutarEjemplo(args);
        }
    }
}