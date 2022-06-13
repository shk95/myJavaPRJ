import java.util.Scanner;

public class BJ_02908_1_220613 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a, b;

        a = s.next();
        b = s.next();

        int a1, a2;

        a1 = func(a);
        a2 = func(b);

        if (a1 > a2) {
            System.out.print(a1);
        } else{
            System.out.print(a2);
        }
    }

    public static int func(String s) {
        int num;
        int result = 0;
        int n = 1;
        for (int i = 0; i < 3; i++) {
            char c;
            c = s.charAt(i);
            num = c - 48;
            result += num * n;//자릿수 별로 10 씩 곱해서 숫자를 뒤집는다.
            n *= 10;
        }
        return result;
    }
}
