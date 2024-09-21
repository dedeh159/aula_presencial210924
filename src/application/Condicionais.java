package application;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = 3.146578;
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        if (numero > 0 && numero % 2 == 0) {
            System.out.println("O número positivo e par");
        } else if (numero < 0) {
            System.out.println("O nmero negativo! ");
        }
        else {
            System.out.println("O número é zero!");
        }
    }
}
