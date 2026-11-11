package Exercicios.DecisãoSimples;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a média do aluno:");
        double note = scan.nextDouble();

        if (note >= 7){
            System.out.print("Aluno aprovado.");
        }else{
            System.out.print("Aluno reprovado.");
        }
        scan.close();
    }    
}