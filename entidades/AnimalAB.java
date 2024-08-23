package entidades;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double peso;
    protected double altura;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double peso, double altura) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
}
