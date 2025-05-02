// Importa todas las interfaces necesarias del paquete 'Interfaces'
import Interfaces.*;

// Importa la clase 'Personaje' desde el paquete 'Personajes.base'
import Personajes.base.Personaje;

// Importa la clase ArrayList de la librería estándar de Java (para manejar listas dinámicas)
import java.util.ArrayList;

public class Juego {
    // Lista para almacenar los personajes que participan en el juego
    private ArrayList<Personaje> personajes;

    // Constructor del juego
    public Juego() {
        this.personajes = new ArrayList<>(); // Inicializa la lista de personajes
    }

    // Método para agregar un personaje al juego
    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje); // Añade el personaje a la lista
    }

    // Método para mostrar las acciones de todos los personajes en el juego
    public void mostrarAcciones() {
        // Recorre todos los personajes en la lista
        for (Personaje p : personajes) {
            System.out.println("\n--- Acciones de " + p.getNombre() + " ---"); // Muestra el nombre del personaje

            p.atacar(); // Cada personaje realiza su acción de ataque

            // Verifica si el personaje puede defenderse (implementa la interfaz Defendible)
            if (p instanceof Defendible) {
                ((Defendible) p).defender(); // El personaje defiende
            }
            // Verifica si el personaje puede lanzar hechizos (implementa la interfaz Magico)
            if (p instanceof Magico) {
                ((Magico) p).lanzarHechizo(); // El personaje lanza un hechizo
            }
            // Verifica si el personaje puede curar (implementa la interfaz Curable)
            if (p instanceof Curable) {
                ((Curable) p).curar(); // El personaje se cura
            }
            // Verifica si el personaje es un pistolero (implementa la interfaz Pistolero)
            if (p instanceof Pistolero) {
                ((Pistolero) p).disparar(); // El personaje dispara
            }
            // Verifica si el personaje puede ladrar (implementa la interfaz Ladrador)
            if (p instanceof Ladrador) {
                ((Ladrador) p).alarido(); // El personaje emite un ladrido
            }
            // Verifica si el personaje puede morder (implementa la interfaz Mordedor)
            if (p instanceof Mordedor) {
                ((Mordedor) p).morder(); // El personaje muerde
            }
        }
    }
}
