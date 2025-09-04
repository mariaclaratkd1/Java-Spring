package Exercicio3;

public class Diretor extends Funcionario implements Contratacao{
    private static final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getSalarioFinal() {
        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public void Admitir(Funcionario funcionario) {

    }

    @Override
    public void Demitir(Funcionario funcionario) {

    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                "\nPrêmio: " + (PREMIO*100) +  "%" +
                "\nSalário Final: " + getSalarioFinal() +
                '}';
    }
}
