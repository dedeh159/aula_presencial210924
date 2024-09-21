package application;

import java.util.Scanner;

public class Uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int total = 0;
        if (M > N && N > 0 && M > 0){
            while (N <= M){
                total+= N;
                N++;
            }

        }
        else if (N > M && M > 0 && N > 0){
            while (N >= M){
                total+= M;
                System.out.println(M +" ");
                M++;
            }

        }
        if (total > 1) {
            System.out.println("Sum=" + total);
        }
    }
}
