package Personajes; // Define el paquete donde se encuentra esta clase

// Importa las interfaces necesarias y la clase base PersonajeFisico
import Interfaces.Pistolero;
import Personajes.base.PersonajeFisico;

// Define la clase Policia, que extiende PersonajeFisico e implementa la interfaz Pistolero
public class Policia extends PersonajeFisico implements Pistolero {
    
    private int balas; // Atributo que guarda el número de balas que tiene el policía

    // Constructor de la clase Policia, inicializa los atributos
    public Policia(String nombre, int nivel, double salud, int fuerza, int balas) {
        super(nombre, nivel, salud, fuerza); // Llama al constructor de la clase base (PersonajeFisico)
        this.balas = balas;
    }

    // Implementación del método atacar (del interface Pistolero)
    @Override
    public void atacar() {
        System.out.println("El policia " + nombre + " ataca con su cuchillo");
    }

    // Implementación del método disparar (del interface Pistolero)
    @Override
    public void disparar() {
        if (balas > 0) {  // Si el policía tiene balas
            System.out.println("El policia " + nombre + " dispara con su pistola al enemigo");
            balas--;  // Resta una bala después de disparar
        } else {  // Si no tiene balas
            System.out.println("Al policia " + nombre + " no le quedan balas");
            System.out.println(nombre + " pierde su turno");  // El policía pierde su turno por falta de balas
        }
    }
    //Getter sobre la cantidad de balas
    public int getBalas() { 
        return balas; 
    }
}

