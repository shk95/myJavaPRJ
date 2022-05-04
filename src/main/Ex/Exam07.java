import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("문자열 입력 ==> ");
        String a = s.nextLine();

        //.length()   : 문자열의 길이 값
        //.charAt()   : 입력된 문자열 번호 출력
        for(int i =a.length()-1; i >= 0; i-- ){
            System.out.printf("%c",a.charAt(i));
        }

    }
}
