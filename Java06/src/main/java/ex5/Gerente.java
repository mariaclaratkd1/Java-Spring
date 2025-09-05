package ex5;

public class Gerente extends CargoDeConfianca{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, Sexo sexo, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, dataAdmissao, sexo, bonificacao);
    }

    @Override
    public String toString() {
        return super.toString() + " | Cargo: Gerente | Salário Final: " + getSalarioFinal();
    }
}
