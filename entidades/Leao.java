package entidades;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, int idade, double peso, double altura) {
        super(nome, "Leao", idade, "Savanas", peso, altura, 4);
    }

    @Override
    public void comer() {
        System.out.println("Leão está comendo.");
    }

    @Override
    public void moverse() {
        System.out.println("Leão está se movendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Leão está dormindo.");
    }
}
