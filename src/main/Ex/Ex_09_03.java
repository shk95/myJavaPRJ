import java.util.Scanner;

public class Ex_09_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
//문자를 () 붙여서 거꾸로 출력
        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");

        if (!str.startsWith("(")) {
            System.out.print("(");
        }

        for (int i = str.length() - 1; i > -1; i--) {
            System.out.printf("%c", str.charAt(i));
        }

        if (!str.endsWith(")")) {
            System.out.println(")");
        }
    }
}
