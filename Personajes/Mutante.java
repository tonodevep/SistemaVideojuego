package Personajes; // Define el paquete donde se encuentra esta clase

// Importa las interfaces y la clase base necesarias
import Interfaces.Ladrador;
import Interfaces.Mordedor;
import Personajes.base.PersonajeFisico;

// Define la clase Mutante, que extiende PersonajeFisico e implementa Ladrador y Mordedor
public class Mutante extends PersonajeFisico implements Ladrador, Mordedor {

    // Constructor de la clase Mutante, inicializa los atributos
    public Mutante(String nombre, int nivel, double salud, int fuerza) {
        super(nombre, nivel, salud, fuerza); // Llama al constructor de la clase base (PersonajeFisico)
    }

    // Implementación del método atacar (del interface Ladrador)
    @Override
    public void atacar() {
        System.out.println("El mutante " + nombre + " ataca, quitando " + fuerza + " de daño ");
    }

    // Implementación del método alarido (del interface Ladrador)
    @Override
    public void alarido() {
        System.out.println("El mutante " + nombre + " suelta un gran graznido, lo que provoca daño en área quitando " + fuerza + " de daño ");
    }

    // Implementación del método morder (del interface Mordedor)
    @Override
    public void morder() {
        System.out.println("El mutante " + nombre + " muerde, quitando " + fuerza + " de daño ");
    }
}
