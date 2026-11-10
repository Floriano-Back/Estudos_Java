package Exercicios.Variaveis;

import java.util.Scanner;

public class Ex003 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota:");
        double nota1 = scanner.nextInt();

        System.out.print("Digite sua nota:");
        double nota2 = scanner.nextInt();

        double media = (nota1 + nota2) /2;

        System.out.print("Sua média é: " + media);
        
        scanner.close();
    }    
}