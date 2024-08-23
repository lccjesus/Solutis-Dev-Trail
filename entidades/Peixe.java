package entidades;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, double peso, double altura) {
        super(nome, "Peixe", idade, "Aquático", peso, altura);
    }

    @Override
    public void comer() {
        System.out.println("Peixe está comendo.");
    }

    @Override
    public void moverse() {
        System.out.println("Peixe está nadando.");
    }

    @Override
    public void dormir() {
        System.out.println("Peixe está dormindo.");
    }

    @Override
    public void nadar() {
        System.out.println("Peixe está nadando.");
    }
}
