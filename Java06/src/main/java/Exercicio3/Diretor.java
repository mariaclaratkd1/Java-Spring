package Exercicio3;

public class Diretor extends Funcionario implements Contratacao{
    private static final double PREMIO = 0.2;

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public void Admitir(Funcionario funcionario) {

    }

    @Override
    public void Demitir(Funcionario funcionario) {

    }
}
