package Exercicios.DecisãoSimples;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade:");
        int age = scan.nextInt();

        if (age >= 18){
            System.out.print("Você é maior de idade!");
        }else{
            System.out.print("Você é menor de idade!");
        }
        scan.close();
    }    
}