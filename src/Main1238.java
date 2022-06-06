import java.util.Locale;
import java.util.Scanner;

public class Main1238 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        int N = Integer.parseInt(sc.nextLine());
        for (int i=0 ; i<N ; i++) {
            String[] str = sc.nextLine().split(" ");
            char[] fr1 = str[0].toCharArray();
            char[] fr2 = str[1].toCharArray();
            String wrd = "";
            for (int z=0 ; z<(fr1.length+fr2.length) ; z++) {
                if (z<fr1.length)
                    wrd+=fr1[z];
                if (z<fr2.length)
                    wrd+=fr2[z];
            }
            System.out.println(wrd);
        }
        sc.close();
    }
}
