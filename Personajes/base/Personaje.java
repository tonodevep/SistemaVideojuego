package Personajes.base; // Define el paquete donde se encuentra esta clase

import java.util.Objects; // Importa la clase Objects para trabajar con hashCode y equals

// Clase abstracta que sirve como base para otros tipos de personajes
public abstract class Personaje {
    protected String nombre;  // Atributo que guarda el nombre del personaje
    protected int nivel;      // Atributo que guarda el nivel del personaje
    protected double salud;   // Atributo que guarda la salud del personaje

    // Constructor que inicializa los atributos del personaje
    public Personaje(String nombre, int nivel, double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    // Método abstracto que obliga a las clases hijas a implementarlo
    public abstract void atacar();

    // Sobrescribe el método toString() para representar al personaje en formato de texto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nivel: " + nivel + ", Salud: " + salud;
    }

    // Sobrescribe el método equals() para comparar dos objetos Personaje
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si ambos objetos son el mismo
        if (obj == null || getClass() != obj.getClass()) return false; // Si los objetos son de tipos diferentes o el objeto es nulo
        Personaje personaje = (Personaje) obj; // Compara los atributos
        return nivel == personaje.nivel && 
               Double.compare(personaje.salud, salud) == 0 && 
               nombre.equals(personaje.nombre); // Compara el nombre, nivel y salud
    }

    // Sobrescribe el método hashCode() para generar un código hash único basado en los atributos del personaje
    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, salud); // Genera el código hash con los atributos
    }

    // Métodos getters y setters
    public String getNombre() { return nombre; } // Devuelve el nombre del personaje
    public int getNivel() { return nivel; } // Devuelve el nivel del personaje
    public double getSalud() { return salud; } // Devuelve la salud del personaje
    public void setSalud(double salud) { this.salud = salud; } // Establece el valor de la salud del personaje
}
