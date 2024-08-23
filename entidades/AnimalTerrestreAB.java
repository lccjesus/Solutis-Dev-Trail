package entidades;

public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, peso, altura);
        this.quantidadePatas = quantidadePatas;
    }
}

