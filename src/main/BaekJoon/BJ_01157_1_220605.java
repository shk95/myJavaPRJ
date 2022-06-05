import java.util.Scanner;

public class BJ_01157_1_220605 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next().toUpperCase();
        //A~Z 카운트용 배열 생성
        int[] a = new int[26];
        //문자에서 단어 하나씩 가져와서 배열에 단어 갯수 카운트
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 65; j < 91; j++) {
                if ((int) c == j) {
                    a[j - 65] += 1;
                    break;
                }
            }
        }
        //개수가 가장 많은 단어 카운트
        int compare = 0, index = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] > compare) {
                compare = a[i];
                index = i;
            }
        }
        //가장 많이 쓴 단어 갯수의 중복값 찾기
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] == compare) {
                count += 1;
            }
        }
        //가장 많이 사용한 단어의 갯수가 중복이 있을경우 ? 출력
        if (count > 1) {
            System.out.print("?");
        } else {
            System.out.print((char) (index + 65));
        }
    }
}
