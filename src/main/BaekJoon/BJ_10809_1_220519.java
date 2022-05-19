import java.util.Scanner;

public class BJ_10809_1_220519 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();

        int N = S.length();//문자열 길이
        //a 97 z 122
        //indexOf 에서 찾는 문자가 없으면 -1을 출력한다.
        for (int i = 97; i < 123; i++) {
            int k;
            k = S.indexOf((char)i);//아스키 코드를 이용
            System.out.print(k);
            System.out.print(" ");
        }
    }
}
