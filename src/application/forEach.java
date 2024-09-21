package application;

public class forEach {
    public static void main(String[] args) {
        int x = 0;

        do {
            System.out.println("Valor de x: " + x);
            x++;
        } while (x < 5);

        int[] numeros = {1,2,3,4,5};

        for (int num : numeros) {
            System.out.println("Numero: " + num);
        }
    }
}
