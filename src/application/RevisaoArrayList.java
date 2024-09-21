package application;

import java.util.ArrayList;

public class RevisaoArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Mariele");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
