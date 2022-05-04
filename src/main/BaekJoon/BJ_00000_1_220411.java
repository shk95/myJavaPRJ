import java.util.Scanner;

public class BJ_00000_1_220411 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();//출력 층 수

        for (int i = 1; i <= a; i++) {//층수 : 1~입력값 a 층까지
            for (int k = a; k - i > 0; k--) {//공백 출력
                System.out.print(" ");
            }
            for (int n = 0; n < i; n++) {//*출력
                System.out.print("*");
            }
            System.out.print("\n");//행넘기기
        }
    }
}
