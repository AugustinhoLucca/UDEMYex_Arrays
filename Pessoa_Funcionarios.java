package entidades;

public class Pessoa_Funcionarios {

    public String nome;
    public int idade;
    public String cpf;
    public String departamento;

    public Pessoa_Funcionarios (String nome, int idade, String cpf, String departamento) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.departamento = departamento;
    }

    public String verificar_maioridade () {
        if (idade < 18) {
            return "Menor de Idade";
        }
        else {
            return "Maior de Idade";
        }
    }

    public String exibir_detalhes () {
        return  "-=-=-=-=-=-"
                + "\nNome: " + nome
                + "\nIdade: " + idade
                + "\nCPF: " + cpf
                + "\nDepartamento: " + departamento
                + "\nMaioridade: " + verificar_maioridade();
    }
}
