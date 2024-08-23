package entidades;

public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, int idade, double peso, double altura) {
        super(nome, "Gato", idade, "Doméstico", peso, altura, 4);
    }

    @Override
    public void comer() {
        System.out.println("Gato está comendo.");
    }

    @Override
    public void moverse() {
        System.out.println("Gato está se movendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Gato está dormindo.");
    }
}
