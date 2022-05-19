import java.util.Scanner;
//문자 하나의 아스키 코드를 구하기
//char 로 바꿔야한다.
public class BJ_11654_1_220519 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        int b = a.charAt(0);
        System.out.println(b);

    }
}
