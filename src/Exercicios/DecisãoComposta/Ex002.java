package Exercicios.DecisãoComposta;

import java.util.Scanner;

public class Ex002 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Você é VIP na loja?");
        String vip = scan.next().toUpperCase();

        if(vip.equals("S")){
            System.out.print("Recebe desconto!");
        }else{
            System.out.print("Qual foi o valor gasto? ");
            double price = scan.nextDouble();
            if(price >= 200){
                System.out.print("Recebe desconto!");
            }else{
                System.out.print("Não recebe desconto!");
            }
        }      
        scan.close();
    }    
}