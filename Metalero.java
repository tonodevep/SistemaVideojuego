import Interfaces.Defendible;

public class Metalero extends PersonajeFisico implements Defendible {
    private String guitarra;
    private boolean escudo;

    public Metalero(String nombre, int nivel, double salud, int fuerza, String guitarra) {
        super(nombre, nivel, salud, fuerza);
        this.guitarra = guitarra;
        this.escudo = true;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su guitarra " + guitarra + " y le quita un " + fuerza + " de daño ");
    }

    @Override
    public void defender() {
        if (escudo) {
            System.out.println(nombre + " se defiende tocando Slayer");
        } else {
            System.out.println(nombre + " no tiene la guitarra afinada para defenderse");
        }
    }

    public void tocarGuitarra() {
        System.out.println(nombre + " está tocando un solo con su " + guitarra);
    }
}
