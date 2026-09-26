package entidades;

public class Filme {

    private String titulo;
    private String diretor;
    private int anoDeLancamento;
    private String genero;


    public Filme(String titulo, String diretor, int anoDeLancamento, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
    }

    public  String verificarCategoria ()  {
        if (anoDeLancamento >= 2025) {
            return "Categoria: Lançamento";
        }
        else if (anoDeLancamento < 2024 && anoDeLancamento > 2010) {
            return "Categoria: Recente";
        }
        else {
            return "Categoria: Clássico";
        }
    }

    public String getTitulo() {
        return titulo;
    }


    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }


    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

}