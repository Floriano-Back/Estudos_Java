package Exercicios.DecisãoComposta;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double note1 = scan.nextDouble();

        System.out.print("Digite sua nota: ");
        double note2 = scan.nextDouble();

        System.out.print("Digite sua frequencia de 0 a 100: ");
        double frequency = scan.nextDouble();

        double media = (note1 + note2) / 2;

        if(frequency >= 75 && media >= 6){
            System.out.print("Aprovado!");
        }else{
           System.out.print("Reprovado!"); 
        }
        scan.close();
    }    
}