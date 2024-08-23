package entidades;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, double peso, double altura) {
        super(nome, "Cachorro", idade, "Doméstico", peso, altura, 4);
    }

    @Override
    public void comer() {
        System.out.println("Cachorro está comendo.");
    }

    @Override
    public void moverse() {
        System.out.println("Cachorro está se movendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro está dormindo.");
    }
}
