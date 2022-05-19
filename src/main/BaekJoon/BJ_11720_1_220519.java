import java.util.Scanner;
//숫자를 각각 한자리씩 전부 더하는문제
/*1 . %활용해서 자릿수를 구하기
2 . 문자열로 입력받아서 char-아스키코드 를 이용
3 . integer 변환 메소드를 이용?*/
public class BJ_11720_1_220519{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String str = s.next();
        int[] intarr = new int[N];
        int sum = 0;

        for(int i = 0 ;i < N ;i++){
            intarr[i] = str.charAt(i)-48;//자리를 char 로 배열 에 받아서 합침.
            sum+=intarr[i];
        }
        System.out.println(sum);
    }
}