package entidades;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
    }

    public abstract void nadar();
}
