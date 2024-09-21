package application;

public class Uri1097 {
    public static void main(String[] args) {

        int J = 3;
        for (int i = 1; i <= 9; i += 2) {
            J += 4;
            if (J > 7) {
                J++;
            }
            for (int j = 0; j < 3; j++) {
                System.out.println("I=" + i + " J=" + J);
                J--;
            }
        }
    }
}
