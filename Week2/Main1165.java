import java.io.IOException;
import java.util.Scanner;
class Main1165 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int sum = 0;
            for (int j = 1; j <= X; j++) {
                if (X % j == 0) {
                    sum++;
                }
            }
            if (sum <= 2) {
                System.out.println(X + " eh primo");
            } else {
                System.out.println(X + " nao eh primo");
            }
        }
    }
}