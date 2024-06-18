package ComputerBMI;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double peso = sc.nextDouble();
double altura = sc.nextDouble();
double imc = peso / Math.abs(altura * altura);
 
        System.out.println(imc);
        }
}
