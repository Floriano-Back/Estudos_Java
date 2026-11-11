package Exercicios.DecisãoSimples;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número:");
        double number = scan.nextDouble();

        if (number >= 0){
            System.out.print("O número é positivo.");
        }else{
            System.out.print("O número é negativo.");
        }
        scan.close();
    }    
}