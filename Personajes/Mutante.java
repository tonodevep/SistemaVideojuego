package Personajes;
import Interfaces.Ladrador;
import Interfaces.Mordedor;
import Personajes.base.PersonajeFisico;

public class Mutante extends PersonajeFisico implements Ladrador, Mordedor {
    
    public Mutante(String nombre, int nivel, double salud, int fuerza) {
        super(nombre, nivel, salud, fuerza);
    }

    @Override
    public void atacar() {
        System.out.println("El mutante " + nombre + " ataca, quitando " + fuerza + " de daño ");
    }

    @Override
    public void alarido() {
        System.out.println("El mutante " + nombre + " suelta un gran graznido, lo que provoca daño en area quitando " + fuerza + " de daño ");
    }

    @Override
    public void morder() {
        System.out.println("El mutante " + nombre + " muerde, quitando " + fuerza + " de daño ");
    }
}
