package Personajes; // Define el paquete donde se encuentra esta clase

// Importa las clases y interfaces necesarias
import Personajes.base.PersonajeMagico;
import Interfaces.Defendible;
import Interfaces.Magico;

// Define la clase Metalero, que extiende PersonajeMagico e implementa Defendible y Mágico
public class Metalero extends PersonajeMagico implements Defendible, Magico {
    private String guitarra;  // Atributo para la guitarra del metalero
 
    // Constructor de la clase Metalero, inicializa los atributos
    public Metalero(String nombre, int nivel, double salud, int fuerza, int mana, String guitarra) {
        super(nombre, nivel, salud, fuerza, mana); // Llama al constructor de la clase base (PersonajeFisico)
        this.guitarra = guitarra;  // Inicializa la guitarra
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
    @Override
    public void lanzarHechizo() {
        if(mana > 15){
            System.out.println(nombre + " está tocando un solo con su " + guitarra);
            mana -= 15;
        } else {
            System.out.println("Su guitarra está desafinada, pierde el turno");
        }
    }
}


