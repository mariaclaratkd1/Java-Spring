package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o nome do aluno: ");
        String nome = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        double notaa = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double notab = ler.nextDouble();

        double media = (notaa + notab) / 2;
        System.out.println("");
        System.out.println("----- RESULTADO -----");
        System.out.println("Aluno(a): " +nome);
        if (media < 7.0){
            System.out.println("Situação: Reprovado! - Média Aritmética: " + media);
        } else {
            System.out.println("Situação: Aprovado! - Nota: " +media);
        }
    }
}
