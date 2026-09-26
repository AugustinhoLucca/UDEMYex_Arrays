package entidades;

public class Carros {

    public String marca;
    public String modelo;
    public String cor;
    public int ano;

    public Carros(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + ", " + cor + ", " + ano;
    }
}

