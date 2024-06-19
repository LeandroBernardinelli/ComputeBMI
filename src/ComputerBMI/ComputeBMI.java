package ComputerBMI;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args){
Scanner in = new Scanner(System.in);
        System.out.println("Digite o peso em libras");
double peso = in.nextDouble();
        System.out.println("Insira a altura em polegadas");
double altura = in.nextDouble();
double imc = (peso/Math.pow(altura,2))*703;
        System.out.println("Seu Índice de Massa Corporal é"+Math.round(imc));
 
        
        }
}
