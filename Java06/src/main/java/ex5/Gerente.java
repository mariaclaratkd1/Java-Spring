package ex5;

public class Gerente extends CargoDeConfianca{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, Sexo sexo) {
        super(nome, cpf, dataNascimento, salarioBase, dataAdmissao, sexo);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
