public abstract class PersonajeFisico extends Personaje {
    protected int fuerza;

    public PersonajeFisico(String nombre, int nivel, double salud, int fuerza) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
    }


    public int getFuerza() { return fuerza; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }
}