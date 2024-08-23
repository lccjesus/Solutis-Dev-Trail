package entidades;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, int idade, double peso, double altura) {
        super(nome, "Elefante", idade, "Selva", peso, altura, 4);
    }

    @Override
    public void comer() {
        System.out.println("Elefante está comendo.");
    }

    @Override
    public void moverse() {
        System.out.println("Elefante está se movendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Elefante está dormindo.");
    }
}
