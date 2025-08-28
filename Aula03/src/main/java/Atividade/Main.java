package Atividade;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Pedro", 25, "71991139530", "maria.c.nascimento9@ba.estudante.senai.br",new Endereco("Rua Jardim Castro Alves", "20", "Casa 1 andar", "40430030", "Salvador", UnidadeFederativa.BA), Sexo1.FEMININO);

        System.out.println(pessoa1.toString());
    }
}
