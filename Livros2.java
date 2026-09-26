package entidades;

public class Livros2 {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int qtdPag;
    private String status;

    public Livros2(String titulo, String autor, int anoPublicacao, int qtdPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.qtdPag = qtdPag;
        this.status = verificarStatus();
    }

    public String verificarStatus() {
         if (anoPublicacao < 2000) {
             return "Antigo";
         }
         else {
             return "Recente";
         }
    }

    public String exibirDetalhes() {
        return  "\nTitulo: " + titulo
                + "\nAutor: " + autor
                + "\nAno de publicação: " + anoPublicacao
                + "\nQuantidade de páginas: " + qtdPag
                + "\nStatus: " + status;
    }
}
