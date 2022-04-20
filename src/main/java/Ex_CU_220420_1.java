import java.util.Scanner;
//코드업 1365

public class Ex_CU_220420_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();//1행
            for (int j = 0; j < n / 2 - 1; j++) {
                System.out.print("*");
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int l = n / 2 - 1; l > 0; l--) {
                    System.out.print(" ");
                }
            }
        }

    }
}
