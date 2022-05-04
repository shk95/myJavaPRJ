import java.util.Scanner;
public class CU_1358_1_220415 {
    //홀수 입력됐을때 삼각형 출력
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n / 2 + 1);

        for (int i = 0; n / 2 + 1 > i; i++) {//행 개수
            for (int j = 0; n / 2 - i > j; j++) {//공백
                System.out.print(".");
            }
            for(int k = 0; 2*(i+1)-1>k; k++){//*출력
                System.out.print("*");
            }
            System.out.print("\n");//줄변경
        }
    }
}
