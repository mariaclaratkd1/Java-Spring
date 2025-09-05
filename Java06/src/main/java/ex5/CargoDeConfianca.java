package ex5;


public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, Sexo sexo, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, dataAdmissao, sexo);
        this.bonificacao = bonificacao;
    }

}
