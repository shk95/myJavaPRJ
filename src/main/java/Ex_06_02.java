import java.util.Scanner;
//반복횟수 스캐너 사용
public class Ex_06_02 {
    public static void main(String[] args) {
        int i,a;
        System.out.print("반복횟수 지정 : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();


        for (i = 0; i<a; i++)
        {
            System.out.print("안녕하세요? 빙글빙글 for 문을 공부중입니다.\n");
        }
    }
}
