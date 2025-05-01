public abstract class PersonajeMagico extends Personaje {
    protected int mana;

    public PersonajeMagico(String nombre, int nivel, double salud, int mana) {
        super(nombre, nivel, salud);
        this.mana = mana;
    }

    // Método propio no abstracto
    public void meditar() {
        System.out.println(nombre + " está meditando para recuperar mana");
        this.mana += 10;
    }

    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
}