import java.util.Scanner;
public class Main1079{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i <n ; i++){
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            double avg = (a*2 +b*3+c*5)/(2.0+3.0+5.0);
            System.out.printf("%.1f\n", avg);
        }
    }
}
