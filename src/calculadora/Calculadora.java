package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int x = 1;
        int entrada;
        while (x == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();

            System.out.println("que calculo deseja efetuar entre esses números?");
            System.out.println("1- Dividir\n2- Multiplicar\n3- Somar\n4- Subtrair");

            entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    if (n2 == 0) {
                        System.out.println("Não é possivel dividir por zero!");
                    } else {
                        System.out.println("O resultado da divisão entre " + n1 + " e " + n2 + " = " + divide(n1, n2));
                    }
                    break;
                case 2:
                    System.out.println("O resultado da multiplicação entre " + n1 + " e " + n2 + " = " + multiplica(n1, n2));
                    break;
                case 3:
                    System.out.println("O resultado da soma entre " + n1 + " e " + n2 + " = " + somar(n1, n2));
                    break;
                case 4:
                    System.out.println("O resultado da subtração entre " + n1 + " e " + n2 + " = " + subtrai(n1, n2));
                    break;
            }
            System.out.println("Deseja continuar? 1-sim  2-não");

            x = sc.nextInt();
        }
    }

    public static double divide(double d1, double d2) {
        if (d2 != 0) {
            return d1 / d2;
        } else System.out.println("Não se divide nada por zero!");
        return 0;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrai(int a, int b) {
        return a - b;
    }
}
