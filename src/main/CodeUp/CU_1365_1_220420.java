import java.util.Scanner;
//코드업 1365

public class CU_1365_1_220420 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        for (int i = 0; i < n; i++) {//row 1 출력
            System.out.print("*");
        }
        System.out.println();
        /*
        x 자 구조를 함수관계로 생각
        y = x, y = -x
        row 2 ~ n-1 까지출력
        */
        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0) || (j == i) || (j == n - 1 - i) || (j == n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {//row n 출력
            System.out.print("*");
        }


    }
}
