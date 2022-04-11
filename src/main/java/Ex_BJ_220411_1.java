import java.util.Scanner;

public class Ex_BJ_220411_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();


        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            int c = s.nextInt();
            System.out.printf("%d\n", c + b);
        }
    }
}