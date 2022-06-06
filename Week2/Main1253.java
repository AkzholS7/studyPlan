import java.util.Scanner;

public class Main1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tst = sc.nextInt();
        String s = sc.nextLine();
        int v = 0;
        for (int o = 0; o < tst; o++) {
            s = sc.nextLine();
            if (v != 0)
                s = sc.nextLine();
            int n = sc.nextInt();
            char[] a = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                int z = ((int) s.charAt(i) - n);
                if (z < 65) {
                    z = z + 26;
                }
                a[i] = (char) z;
                System.out.print(a[i]);
            }
            System.out.print("\n");
            v++;
        }
    }
}