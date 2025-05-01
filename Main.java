// Importa todas las clases del paquete 'Personajes'
import Personajes.*;

public class Main {
    public static void main(String[] args) {
        // Crea una nueva instancia del juego
        Juego juego = new Juego();

        // Crear personajes y asignarles sus propiedades
        Metalero metalero = new Metalero("Metalero", 10, 100, 50, 17, "Gibson"); // Crea un personaje Metalero
        Antonia antonia = new Antonia("Antonia", 8, 80, 50, 4, "del Sagrado Corazón"); // Crea un personaje Antonia
        Policia policia = new Policia("Leon", 9, 80, 9, 2); // Crea un personaje Policia
        Mutante mutante = new Mutante("Perro Sanxe", 10, 200, 15); // Crea un personaje Mutante

        // Agregar los personajes creados al juego
        juego.agregarPersonaje(metalero); // Agrega el Metalero al juego
        juego.agregarPersonaje(antonia); // Agrega Antonia al juego
        juego.agregarPersonaje(policia); // Agrega el Policia al juego
        juego.agregarPersonaje(mutante); // Agrega el Mutante al juego

        // Llama al método para mostrar las acciones de los personajes en el juego
        juego.mostrarAcciones(); // Muestra las acciones de todos los personajes en el juego
    }
}
