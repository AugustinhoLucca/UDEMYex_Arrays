package entidades;

public class Funcionarios {

    public String nome;
    public int idade;
    public String cpf;
    public String departamento;

    @Override
    public String toString() {
        return nome
                + ", "
                + idade
                + " anos, CPF - "
                + cpf
                + ", "
                + "Departamento de " + departamento;
    }
}
