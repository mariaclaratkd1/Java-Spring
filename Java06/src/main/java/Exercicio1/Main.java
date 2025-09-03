package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Soma soma1 = new Soma();
        Subtracao subtracao1 = new Subtracao();
        Multiplicacao multiplicacao1 = new Multiplicacao();
        Divisao divisao1 = new Divisao();

        System.out.println(soma1.calcular(6, 9));
        System.out.println(subtracao1.calcular(5, 8));
        System.out.println(multiplicacao1.calcular(2, 3));
        System.out.println(divisao1.calcular(5, 2));
    }
}
