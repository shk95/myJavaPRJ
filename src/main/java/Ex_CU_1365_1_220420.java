import java.util.Scanner;
//코드업 1365

public class Ex_CU_1365_1_220420 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = n / 2;//짝수 홀수 관계없이 한번에 받음.
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();//1행
        int i = 0;
        while (i < x - 1) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < x * 2 - 4 - 2 * i; k++) {//가운데 공백
                System.out.print(" ");

            }
            if (n % 2 != 0) {//홀수일때
                System.out.print(" ");
            }
            System.out.print("*");
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        --i;
        if (n % 2 != 0) {//홀수일때 가운대 행 추가
            System.out.print("*");
            for (int a = 1; a < x; a++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int a = 1; a < x; a++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        //마지막부분 부터 거꾸로 출력.
        while (i > -1) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < x * 2 - 4 - 2 * i; k++) {//가운데 공백
                System.out.print(" ");

            }
            if (n % 2 != 0) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            i--;

        }
        for (int j = 0; j < n; j++) {
            System.out.print("*");//마지막 행


        }


    }
}
