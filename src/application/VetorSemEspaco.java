package application;

public class VetorSemEspaco {
    public static void main(String[] args) {
        String frase = "Vetor contedo espaços entre palavras";
        char [] vetor = frase.toCharArray();
        char [] vetorSemEspacos = new char[frase.length()];

        int j = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != ' ') {
                vetorSemEspacos[j] = vetor[i];
                j++;
            }
        }
        String fraseSemEspaços = new String(vetorSemEspacos,0,j);
        System.out.println("Frase sem espaços em branco: " + fraseSemEspaços);
    }
}
