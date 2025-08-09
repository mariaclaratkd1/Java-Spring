package org.example;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        final int CONST = 2;
        double media = 0;
        Scanner ler = new Scanner(System.in);
        double[] notas = new double [CONST];
        for (int i = 0; i < CONST; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + " nota: ");
                notas[i] = ler.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);
            media = notas[i] + notas[i] / CONST;
        }

        System.out.println("\nExibindo notas: ");
        for (double nota : notas){
            System.out.println("Nota: "+nota);
        }
        System.out.println("Média: "+media);
    }
}