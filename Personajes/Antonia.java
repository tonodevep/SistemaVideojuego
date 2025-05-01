package Personajes; // Define el paquete donde se encuentra esta clase

// Importa clases y interfaces necesarias
import Personajes.base.PersonajeMagico;
import Interfaces.Magico;
import Interfaces.Curable;

// Define la clase Antonia, que extiende PersonajeMagico e implementa Magico y Curable
public class Antonia extends PersonajeMagico implements Magico, Curable {
    private String rosario; // Atributo propio de Antonia

    // Constructor de la clase que inicializa los atributos
    public Antonia(String nombre, int nivel, double salud, int mana, String rosario) {
        super(nombre, nivel, salud, mana); // Llama al constructor de la clase base
        this.rosario = rosario;
    }

    // Implementación del método atacar
    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un ataque mágico con su rosario " + rosario);
    }

    // Implementación del método lanzarHechizo
    @Override
    public void lanzarHechizo() {
        if (mana > 0) {
            System.out.println(nombre + " lanza un hechizo poderoso");
            mana -= 10; // Resta 10 de mana al lanzar el hechizo
        } else {
            System.out.println(nombre + " no tiene suficiente mana");
        }
    }

    // Implementación del método curar
    @Override
    public void curar() {
        System.out.println(nombre + " usa su poder curativo");
        salud += 20; // Suma salud
        mana -= 5;   // Resta algo de mana
    }

    // Método adicional exclusivo de Antonia
    public void rezar() {
        System.out.println(nombre + " reza con su rosario " + rosario);
        mana += 5; // Rezar aumenta el mana
    }
}
