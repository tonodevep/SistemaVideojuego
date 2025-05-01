import java.util.Objects;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected double salud;

    public Personaje(String nombre, int nivel, double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public abstract void atacar();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nivel: " + nivel + ", Salud: " + salud;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personaje personaje = (Personaje) obj;
        return nivel == personaje.nivel && 
               Double.compare(personaje.salud, salud) == 0 && 
               nombre.equals(personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, salud);
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public double getSalud() { return salud; }
    public void setSalud(double salud) { this.salud = salud; }
}