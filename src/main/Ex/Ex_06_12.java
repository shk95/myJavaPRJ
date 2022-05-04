import java.util.Scanner;

public class Ex_06_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, dan;

        System.out.print(" 몇 단 ? ");
        dan = s.nextInt();
        for (i = 9; i > 0; i--) {
            System.out.printf(" %d X %d = %d\n", dan, i, dan * i);
        }

    }
}
