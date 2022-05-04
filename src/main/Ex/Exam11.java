import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        System.out.print("첫번째 수를 입력하세요 : ");
        a = s.nextInt();

        System.out.print("계산할 연산자를 입력하세요 : ");
        ch = s.next().charAt(0);//charAt(0) --> 첫번째 글자 추출

        System.out.print("두번째 수를 입력하세요 : ");
        b = s.nextInt();

        if (ch == '+') {
            System.out.printf("%d + %d = %d 입니다.\n", a, b, a + b);

        }
        if (ch == '-') {
            System.out.printf("%d - %d = %d 입니다.\n", a, b, a - b);

        }
        if (ch == '*') {
            System.out.printf("%d * %d = %d 입니다.\n", a, b, a * b);

        }
        if (ch == '/') {
            System.out.printf("%d / %d = %d 입니다.\n", a, b, a / b);

        }
        if (ch == '%') {
            System.out.printf("%d %% %d = %d 입니다.\n", a, b, a % b);

        }
    }
}