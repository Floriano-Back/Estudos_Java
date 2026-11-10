package Exercicios.Variaveis;

import java.util.Scanner;

public class Ex005 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o tamanho da base do triangulo:");
        double base = scan.nextDouble();

        System.out.print("Escreva o tamanho da altura do triangulo:");
        double height = scan.nextDouble();

        double result = (base * height)/2;

        System.out.print("A área do triangulo é: " +result);

        scan.close();
    }    
}