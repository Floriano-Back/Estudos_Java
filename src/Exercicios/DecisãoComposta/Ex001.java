package Exercicios.DecisãoComposta;

import java.util.Scanner;

public class Ex001 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int age = scan.nextInt();

        if(age >= 18){
            System.out.print("Possui ingresso? ");
            String ticket = scan.next().toUpperCase();
            if(ticket.equals("S")){
                System.out.print("Permitido");
            }else{
                System.out.print("Negado");
            }
        }else{
            System.out.print("Negado");
        }

        scan.close();
    }  
}