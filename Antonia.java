public class Antonia extends PersonajeMagico implements Magico, Curable {
    private String rosario;

    public Antonia(String nombre, int nivel, double salud, int mana, String rosario) {
        super(nombre, nivel, salud, mana);
        this.rosario = rosario;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un ataque mágico con su rosario " + rosario);
    }

    @Override
    public void lanzarHechizo() {
        if (mana > 0) {
            System.out.println(nombre + " lanza un hechizo poderoso");
            mana -= 10;
        } else {
            System.out.println(nombre + " no tiene suficiente mana");
        }
    }

    @Override
    public void curar() {
        System.out.println(nombre + " usa su poder curativo");
        salud += 20;
        mana -= 5;
    }

    public void rezar() {
        System.out.println(nombre + " reza con su rosario " + rosario);
        mana += 5;
    }
}