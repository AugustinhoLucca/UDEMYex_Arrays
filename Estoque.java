package entidades;

public class Estoque {

    public String nome;
    public double preco;
    public int quant_estoque;

    public Estoque(String nome, double preco, int quant_estoque) {
            this.nome = nome;
            this.preco = preco;
            this.quant_estoque = quant_estoque;
    }

    @Override
    public String toString() {
        return "Nome --> " + nome + "\nPreço --> " + preco + "\nQuantidade --> " + quant_estoque + "\nTotal --> R$" + total();
    }

    public void AdicionarProdutos (int quantidade){
        quant_estoque += quantidade;
    }

    public void RemoverProdutos (int quantidade){
        quant_estoque -= quantidade;
    }

    public double total () {
        return quant_estoque * preco;
    }
}


