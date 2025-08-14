package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta = "";

        do{
            double nota1, nota2;

            System.out.println("Digite uma nota: ");
            nota1 = ler.nextDouble();
            System.out.println("Digite outra nota: ");
            nota2 = ler.nextDouble();

            if ((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10)) {
                notas.add(nota1);
                notas.add(nota2);
            } else {
                System.out.println("Uma ou ambas as notas são inválidas. Digite novamente valores entre 0 e 10.");
                continue;
            }

            System.out.println("Deseja inserir mais uma nota? (Pressione a tecla N para sair.)");
            ler.nextLine();
            resposta = ler.nextLine();
        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas: ");
        for (double nota:notas){
            System.out.println("Nota: " +nota);
        }
    }
}
