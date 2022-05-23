import java.util.Scanner;

public class BJ_02675_1_220523 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S;//입력문자 S
        int R, T;//첫째줄의 테스트케이스 T, 각 문자의 반복횟수 R

        T = s.nextInt();

        for (int i = 0; i < T; i++) {//테스트 반복
            R = s.nextInt();
            S = s.next();
            int strLen = S.length();
            for (int j = 0; j < strLen; j++) {//
                char c = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
