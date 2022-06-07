import java.util.Arrays;
import java.util.Scanner;

public class Main1045 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        float[] sides = new float[3];

        sides[0] = Float.parseFloat(input.split(" ")[0]);
        sides[1] = Float.parseFloat(input.split(" ")[1]);
        sides[2] = Float.parseFloat(input.split(" ")[2]);

        Arrays.sort(sides);

        float A = sides[2];
        float B = sides[1];
        float C = sides[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A * A == B * B + C * C) {
            System.out.println("TRIANGULO RETANGULO");
        } else {
            if (A*A > B*B + C*C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A*A < B*B + C*C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && C == A) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C) || (B == C && B != A) || (C == A && C != B)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
