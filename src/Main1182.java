import java.util.Scanner;

public class Main1182 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int L = t.nextInt();

        double[][] M = new double[12][12];
        boolean T = false;
        double soma = 0;
        String s = t.next();
        if (s.equals("S")) {
            T = true;
        } else if (s.equals("M")) {
            T = false;
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = t.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            soma += M[i][L];
        }

        if (T) {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", (soma/M.length));
        }
    }
}