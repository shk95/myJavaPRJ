import java.util.Scanner;

public class Ex_test_01 {
    public static void main(String[] args) {
        //수업 활용 테스트 22.03.30
        //입력한숫자 홀짝 확인.
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = a % 2;

        if (b == 1) {
            System.out.println("홀 입니다");

        } else {
            System.out.println("짝 입니다");
        }

    }
}
