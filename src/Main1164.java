import java.util.Scanner;

class Main1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int sum = 0;
            for (int j = 1; j < X; j++) {
                if (X % j == 0) {
                    sum += j;
                }
            }
            if (sum == X) {
                System.out.println(X + " eh perfeito");
            } else {
                System.out.println(X + " nao eh perfeito");
            }
        }
    }
}
