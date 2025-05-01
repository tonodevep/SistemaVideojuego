package Personajes.base; // Define el paquete donde se encuentra esta clase

// Clase abstracta que extiende Personaje, especializada en personajes físicos
public abstract class PersonajeFisico extends Personaje {
    protected int fuerza; // Atributo que representa la fuerza del personaje físico

    // Constructor de la clase PersonajeFisico, inicializa los atributos heredados y propios
    public PersonajeFisico(String nombre, int nivel, double salud, int fuerza) {
        super(nombre, nivel, salud); // Llama al constructor de la clase base Personaje
        this.fuerza = fuerza; // Inicializa la fuerza del personaje físico
    }

    // Método getter para obtener el valor de fuerza
    public int getFuerza() {
        return fuerza; // Devuelve la fuerza del personaje
    }

    // Método setter para establecer el valor de fuerza
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza; // Establece el valor de la fuerza del personaje
    }
}
