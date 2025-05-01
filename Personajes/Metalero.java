package Personajes; // Define el paquete donde se encuentra esta clase

// Importa las clases y interfaces necesarias
import Personajes.base.PersonajeFisico;
import Interfaces.Defendible;

// Define la clase Metalero, que extiende PersonajeFisico e implementa Defendible
public class Metalero extends PersonajeFisico implements Defendible {
    private String guitarra;  // Atributo para la guitarra del metalero
    private boolean escudo;   // Atributo para saber si tiene el escudo activo

    // Constructor de la clase Metalero, inicializa los atributos
    public Metalero(String nombre, int nivel, double salud, int fuerza, String guitarra) {
        super(nombre, nivel, salud, fuerza); // Llama al constructor de la clase base (PersonajeFisico)
        this.guitarra = guitarra;  // Inicializa la guitarra
        this.escudo = true;        // Inicializa el escudo como activo
    }

    // Implementación del método atacar (del interface Defendible)
    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su guitarra " + guitarra);
    }

    // Implementación del método defender (del interface Defendible)
    @Override
    public void defender() {
            System.out.println(nombre + " se defiende tocando Slayer");
    }

    // Método adicional exclusivo de Metalero para tocar guitarra
    public void tocarGuitarra() {
        if()
        System.out.println(nombre + " está tocando un solo con su " + guitarra);
    }
}

