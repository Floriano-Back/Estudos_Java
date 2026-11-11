package Exercicios.DecisãoSimples;

import java.util.Scanner;

public class Ex004 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

         System.out.print("Digite uma letra: ");
         String letter = scan.next().toUpperCase();

         if (letter.equals("Z")){
            System.out.print("Letra correta!");
         }else{
            System.out.print("Letra incorreta!");
         }
         scan.close();
    }    
}