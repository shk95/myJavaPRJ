import java.util.Scanner;

public class Exam12 {
    public static void main(String[] args) {//중복 if 문 사용
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        System.out.print("첫번째 수를 입력하세요 : ");
        a = s.nextInt();

        System.out.print("계산할 연산자를 입력하세요 : ");
        ch = s.next().charAt(0);

        System.out.print("두번째 수를 입력하세요 : ");
        b = s.nextInt();

        if (ch == '+') {
            System.out.printf("%d + %d = %d 입니다. \n", a, b, a + b);
        } else if (ch == '-') {
            System.out.printf("%d - %d = %d 입니다. \n", a, b, a - b);
        }else if (ch == '*') {
            System.out.printf("%d * %d = %d 입니다. \n", a, b, a * b);
        }else if (ch == '/') {
            System.out.printf("%d / %d = %d 입니다. \n", a, b, a / b);
        }else if (ch == '%') {
            System.out.printf("%d %% %d = %d 입니다. \n", a, b, a % b);
        }else
            System.out.print("연산자를 잘못 입력했습니다. \n");

    }
}
