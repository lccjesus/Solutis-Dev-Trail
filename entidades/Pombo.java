package entidades;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, double peso, double altura, double envergaduraAssa) {
        super(nome, "Pombo", idade, "Urbano", peso, altura, 2, envergaduraAssa);
    }

    @Override
    public void comer() {
        System.out.println("Pombo está comendo.");
    }

    @Override
    public void moverse() {
        System.out.println("Pombo está voando.");
    }

    @Override
    public void dormir() {
        System.out.println("Pombo está dormindo.");
    }

    @Override
    public void voar() {
        System.out.println("Pombo está voando.");
    }
}
