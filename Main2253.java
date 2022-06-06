import java.util.Locale;
import java.util.Scanner;

public class Main2253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        int okA=0, oka=0, third=0;
        while(sc.hasNext()){
            String s = sc.nextLine();
            if (s.length() >= 6 && s.length() <= 32){
                for(int i=0 ; i<s.length() ; i++){
                    if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                        oka++;
                    else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        okA++;
                    else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                        third++;
                }
                if (okA==0)
                    System.out.println("Senha invalida.");
                else if (oka==0)
                    System.out.println("Senha invalida.");
                else if (third==0)
                    System.out.println("Senha invalida.");
                else if (okA+oka+third==s.length())
                    System.out.println("Senha valida.");
                else
                    System.out.println("Senha invalida.");
            }
            else
                System.out.println("Senha invalida.");

            oka=0;
            okA=0;
            third=0;
        }
        sc.close();
    }
}
