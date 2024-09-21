package application;

public class VetorExercicioImpares {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int numeroImpar = 1;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numeroImpar;
            numeroImpar+= 2;
        }

        System.out.println("Vetor preenchido com os 10 primeiros números ímpares: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}
