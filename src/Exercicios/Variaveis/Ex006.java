package Exercicios.Variaveis;

import java.util.Scanner;

public class Ex006 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade:");
        int age = scan.nextInt();

        int ageDays = age *365;

        System.out.print("Sua idade " +age+ "anos em dias é " +ageDays);

        scan.close();
    }    
}