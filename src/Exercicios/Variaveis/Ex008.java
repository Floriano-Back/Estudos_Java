package Exercicios.Variaveis;

import java.util.Scanner;

public class Ex008 {
    public static void main (String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a temperatura:");
    double celcius = scan.nextDouble();

    double convert = (celcius * (9/5))+32;

    System.out.print("A temperatura de: " +celcius+ " C° para: " +convert+ " F°");

    scan.close();

    }    
}