package entidades;

public class Deposito {

    private String numeroConta;
    private String nomeTitular;
    private double depositoInicial;
    private double saldo;

    public Deposito(String numeroConta, String nomeTitular, double depositoInicial, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.depositoInicial = depositoInicial;
        this.saldo = saldo;
    }

    public Deposito(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String exibirDetalhes () {
        return "Conta : " + numeroConta
                + "\nTitular: " + nomeTitular
                + "\nSaldo: " + saldo;
    }


}
