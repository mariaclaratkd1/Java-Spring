package Exercício4;

import Exercicio3.Funcionario;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }
    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public void Admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public void Demitir(Exercício4.Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.getNome());
    }
}
