package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaValoresVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        lista.addAll(List.of(59,28,3,65,32));

        System.out.println("Digite o valor de X (0-4): ");
        int x = sc.nextInt();
        System.out.println("Digite o valor de Y (0-4): ");
        int y = sc.nextInt();

        if (x >= 0 && x <= 4 && y >= 0 && y <= 4) {
            int soma = lista.get(x) + lista.get(y);
            System.out.println("A soma dos valores em X e Y é " + soma);
        }
        else {
            System.out.println("Posições inválidas, X e Y devem estar entre 0 e 4.");
        }
        sc.close();
    }
}
