package entidades;

public class Carros2 {

    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public Carros2(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public Carros2(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String verificarAntiguidade () {

        if (anoFabricacao < 2010){
            return "Modelo Antigo";
        }
        else if (2010 < anoFabricacao && anoFabricacao < 2020) {
            return "Modelo Semi-Novo";
        }
        else {
            return "Modelo Novo";
        }
    }

    public String exibirDetalhes () {
        return  "-=-=-=-=-" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCor: " + cor +
                "\nCondição: " + verificarAntiguidade();
    }
}


