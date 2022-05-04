import java.util.Scanner;

public class BJ_01110_1_220504 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int i = 0;
        int N1, N2;
        N1 = N;
        while (true) {
            N2 = (N1 % 10) * 10 + (N1 / 10 + (N1 % 10)) % 10;
            i++;
            if (N == N2) {
                System.out.println(i);
                break;
            }
            N1 = N2;
        }
    }
}
