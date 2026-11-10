package Exercicios.Variaveis;

import java.util.Scanner;

public class Ex004 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número:");
        double number = scanner.nextDouble();

        double dobro = number * 2;

        System.out.print("O dobro do número: " +number+ " é " +dobro);

        scanner.close();
    }    
}