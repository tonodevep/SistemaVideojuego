package Personajes;
import Interfaces.Pistolero;

public class Policia extends PersonajeFisico implements Pistolero {
    
    private int balas = 2;
    
    
    public Policia(String nombre, int nivel, double salud, int fuerza) {
        super(nombre, nivel, salud, fuerza);
    }

    @Override
    public void atacar() {
        System.out.println("El policia " + nombre + " ataca con su cuchillo quitando " + fuerza + " de daño ");
    }

    @Override
    public void disparar(){
        if (balas > 0){
            System.out.println("El policia " + nombre + " dispara con su pistola al enemigo y le quita " + fuerza + " de daño");
            balas--;
        }else{
            System.out.println("A el policia " + nombre + " no le quedan balas");
            System.out.println(nombre + " pierde su turno");
        }
    }
}
