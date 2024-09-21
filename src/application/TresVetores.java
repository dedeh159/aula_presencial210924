package application;

public class TresVetores {
    public static void main(String[] args) {
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Preenchendo valores do vetor");
            vetor1[i] = i * 2;
            vetor2[i] = i * 2 + 1;
        }
        for (int i = 0; i < 5; i++) {
            vetor3[i * 2] = vetor1[i];
            vetor3[i * 2 + 1] = vetor2[i];
        }
        System.out.println("Vetor resultante: ");
        for (int valor : vetor3) {
            System.out.println(valor + " ");
        }


    }
}
