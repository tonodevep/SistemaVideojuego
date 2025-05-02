package Personajes.base;
// Clase abstracta que hereda de Personaje, representando a un personaje mágico
public abstract class PersonajeMagico extends Personaje {
    
    // Atributo para almacenar la cantidad de mana del personaje
    protected int mana;
    
    // Atributo privado para almacenar la fuerza del personaje
    private int fuerza;

    // Constructor de la clase, que inicializa el nombre, nivel, salud, mana y fuerza del personaje
    public PersonajeMagico(String nombre, int nivel, double salud, int mana, int fuerza) {
        // Llamada al constructor de la clase base (Personaje) para inicializar nombre, nivel y salud
        super(nombre, nivel, salud);
        this.mana = mana;  // Inicializa mana
        this.fuerza = fuerza;  // Inicializa fuerza
    }

    // Método no abstracto que permite al personaje meditar y recuperar mana
    public void meditar() {
        System.out.println(nombre + " está meditando para recuperar mana");
        this.mana += 10;  // Recupera 10 puntos de mana
    }

    // Getter para obtener el valor de mana
    public int getMana() { 
        return mana; 
    }

    // Setter para establecer el valor de mana
    public void setMana(int mana) { 
        this.mana = mana; 
    }

    //Getter para obtener el valor de fuerza
    public int getFuerza() { 
        return fuerza; 
    }
}

