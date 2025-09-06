package ex5;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, Sexo sexo) {
        super(nome, cpf, dataNascimento, salarioBase, dataAdmissao, sexo);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", sexo=" + sexo +
                ", salarioFinal=" + this.getSalarioFinal() +
                '}';
    }

    @Override
    public void Admitir(Funcionario funcionario) {
        System.out.println("Admitindo: " + super.nome);
    }

    @Override
    public void Demitir(Funcionario funcionario) {
        System.out.println("Demitindo: " + super.nome);
    }

    @Override
    public double getSalarioFinal() {
        return (super.salarioBase * (super.bonificacao.getValor()) * this.PREMIO);
    }
}
