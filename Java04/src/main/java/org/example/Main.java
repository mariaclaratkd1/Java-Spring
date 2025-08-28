package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1,"Maria", 18, 15000.0, Setor.VENDAS, Sexo.FEMININO);

        System.out.println(funcionario1.toString());
    }
}
