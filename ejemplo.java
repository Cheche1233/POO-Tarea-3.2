// Clase abstracta para operaciones matemáticas
abstract class OperacionMatematica {
    int numero1;
    int numero2;

    public OperacionMatematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    abstract int realizarOperacion(); // Método abstracto a ser implementado por las clases concretas
}

// Interfaz para niveles de dificultad
interface NivelDificultad {
    void generarOperacion(); // Método abstracto a ser implementado por las clases que implementen esta interfaz
}

// Clase concreta para la operación de suma
class Suma extends OperacionMatematica {
    public Suma(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    int realizarOperacion() {
        return numero1 + numero2;
    }
}

// Clase que implementa la interfaz para el nivel de dificultad
class NivelFacil implements NivelDificultad {
    @Override
    public void generarOperacion() {
        // Lógica para generar una operación matemática de nivel fácil
        System.out.println("Operación de nivel fácil generada.");
    }
}

public class JuegoMatematicas {
    public static void main(String[] args) {
        Suma suma = new Suma(5, 3);
        System.out.println("Resultado de la suma: " + suma.realizarOperacion());

        NivelDificultad nivelFacil = new NivelFacil();
        nivelFacil.generarOperacion();
    }
}
