package entidades;

public class Filme2 {

    private String titulo;
    private String genero;
    private int classificacaoIndicativa;
    private int anodeLancamento;
    private double nota;

    public Filme2(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Filme2(String titulo, String genero, int classificacaoIndicativa, int anodeLancamento, double nota) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.anodeLancamento = anodeLancamento;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getAnodeLancamento() {
        return anodeLancamento;
    }

    public void setAnodeLancamento(int anodeLancamento) {
        this.anodeLancamento = anodeLancamento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public String verificarNota () {
        if (nota < 2.0) {
            return "Péssimo";
        }
        else if (nota < 4.0) {
            return "Ruim";
        }
        else if (nota < 5.5) {
            return "Regular";
        }
        else if (nota < 7.0) {
            return "Bom";
        }
        else if (nota < 8.5) {
            return "Muito Bom";
        }
        else {
            return "Excelente";
        }
    }

    public String verificarEpoca() {
        if (anodeLancamento < 1970) {
            return "Antigo (anterior à 1970)";
        }
        else if (anodeLancamento < 1980) {
            return "Anos 70";
        }
        else if (anodeLancamento < 1990) {
            return "Anos 80";
        }
        else if (anodeLancamento < 2000) {
            return "Anos 90";
        }
        else if (anodeLancamento < 2010) {
            return "Anos 2000";
        }
        else if (anodeLancamento < 2020) {
            return "Era Digital (Década de 2010)";
        }
        else {
            return "Moderno (Pós Pandemia)";
        }
    }

    public String verifClassificacaoIndicativa() {
        if (classificacaoIndicativa < 13) {
            return "Livre para todas as idades";
        }
        else if (classificacaoIndicativa < 16) {
            return "Maiores de 13 anos";
        }
        else if (classificacaoIndicativa < 18) {
            return "Maiores de 16 anos";
        }
        else {
            return "Maiores de Idade (+18)";
        }
    }


}
