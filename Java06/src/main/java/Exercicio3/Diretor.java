package Exercicio3;

public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo.getTexto() +
                ", setor=" + setor.getTexto() +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.getSalairoFinal() +
                '}';
    }

    @Override
    public void Admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionário: " + funcionario.nome);
    }

    @Override
    public void Demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.nome);
    }

    @Override
    public double getSalairoFinal() {
        return super.salarioBase + (super.salarioBase + this.PREMIO);
    }
}
