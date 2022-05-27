import java.util.Scanner;

public class Main1160 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int year = 0;
        for (int i = 0; i < T; i++) {
            year =0;
            int PA = sc.nextInt();
            int PB = sc.nextInt();
            double G1 = sc.nextDouble();
            double G2 = sc.nextDouble();
            if (PA < PB) {
                while (PA <= PB) {
                    if (year > 100) {
                        break;
                    }
                    PA = (int) (PA + (PA * (G1 / 100)));
                    PB = (int) (PB + (PB * (G2 / 100)));
                    year++;
                }
            }
            if (year > 100) {
                System.out.println("Mais de 1 seculo.");

            } else {
                System.out.println(year + " anos.");
            }
        }

    }
}