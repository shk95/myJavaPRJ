import java.util.Scanner;

public class Ex_test_03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) || (((i % 5) == 0))) {
                a = a + i;
            }
        }
        System.out.printf("%d", a);


    }
}
