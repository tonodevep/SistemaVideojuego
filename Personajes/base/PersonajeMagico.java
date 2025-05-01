package Personajes.base; // Define el paquete donde se encuentra esta clase

// Clase abstracta que extiende Personaje, especializada en personajes mágicos
public abstract class PersonajeMagico extends Personaje {
    protected int mana; // Atributo que representa el mana del personaje mágico

    // Constructor de la clase PersonajeMagico, inicializa los atributos heredados y el propio mana
    public PersonajeMagico(String nombre, int nivel, double salud, int mana) {
        super(nombre, nivel, salud); // Llama al constructor de la clase base Personaje
        this.mana = mana; // Inicializa el mana del personaje mágico
    }

    // Método no abstracto que permite al personaje mágico meditar y recuperar mana
    public void meditar() {
        System.out.println(nombre + " está meditando para recuperar mana");
        this.mana += 10; // Recupera 10 puntos de mana
    }

    // Métodos getter y setter para el mana
    public int getMana() {
        return mana; // Devuelve el valor de mana del personaje mágico
    }

    public void setMana(int mana) {
        this.mana = mana; // Establece el valor de mana del personaje mágico
    }
}
