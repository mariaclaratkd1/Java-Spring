package ex5;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, Sexo sexo, double PREMIO) {
        super(nome,
                cpf,
                dataNascimento,
                salarioBase,
                dataAdmissao,
                sexo
        );
        this.PREMIO = PREMIO;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                '}';
    }

    @Override
    public void Admitir(Funcionario funcionario) {

    }

    @Override
    public void Demitir(Funcionario funcionario) {

    }

    public double obterSalarioFinal(Funcionario funcionario) {
        return salarioBase * (salarioBase * PREMIO);
    }
}
