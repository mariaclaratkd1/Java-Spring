package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Maria", "05/10/2007", Sexo.FEMININO, Setor.OPERACOES,
                12.000){
            Motoboy motoboy = new Motoboy("A");
            Diretor diretor = new Diretor();
        };

        System.out.println(funcionario1.toString());
    }
}
