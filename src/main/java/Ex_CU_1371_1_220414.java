import java.util.Scanner;

public class Ex_CU_1371_1_220414 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//코드업 문제 1371 마름모 출력

        for (int x = -n; x < n + 1; x++) {//함수관계로 수정
            for (int y = -n; y < n + 1; y++) {
                if ((y == x + n) || (y == x - n) || (y == -x + n) || (y == -x - n)) {
                    System.out.print("*");
                } else {
                    System.out.print(".");

                }

            }
            System.out.println();

        }
    }
}