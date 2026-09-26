package entidades;

public class Livros {

    public String titulo;
    public String autor;
    public int ano;
    public int pag;

    public Livros(String titulo, String autor, int ano, int pag) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.pag = pag;
    }

    @Override
    public String toString() {
        return titulo + " por " + autor + ", " + ano + " ," + pag + " paginas.";
    }

}
