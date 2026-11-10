package Exercicios.Variaveis;

import java.util.Scanner;

public class Ex007 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número:");
        int number = scan.nextInt();

        System.out.print("O número antes é " +(number-1)+ ", o escolhido foi: " +number+ ", depois é: " +(1+number));

        scan.close();
    }
}
