package Exercicio3;

public class Main {
    public static void main(String[] args) {
            Motoboy motoboy = new Motoboy("Alice", "12/05/2001", Sexo.FEMININO, Setor.FINANCEIRO, 1000,
                    "B");
            Diretor diretor = new Diretor("Joao", "05/2/2000", Sexo.MASCULINO, Setor.OPERACOES,
                    12500);
        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());

        diretor.Admitir(motoboy);
    }
}
