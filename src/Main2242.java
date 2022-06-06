import java.util.Locale;
import java.util.Scanner;

public class Main2242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        String string = sc.next();
        String lol = "";

        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
                lol = lol + string.charAt(i);

        String relol = new StringBuilder(lol).reverse().toString();

        if (lol.equals(relol))
            System.out.println("S");
        else
            System.out.println("N");

        sc.close();
    }
}