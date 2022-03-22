import java.util.Scanner;

public class Ex_A_220321_1 {
/*간단 수학계산 테스트
ex) a * b = c   [a b c 를 입력하고, 계산을 맞춘다.다양한 연산자로.]*/
//1.수식 입력
//2.실행후 맞았는지 틀렸는지 판단결과를 출력

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        //입력숫자
        //입력숫자 a,b 와 출력결과 c
        boolean A;
        //계산결과 true false
        String s;
        //연산자

        System.out.println("숫자와 연산 종류를 입력하세요.\n예)1+2=3");
        a = sc.nextInt();
        s = sc.nextLine();
        b = sc.nextInt();
        c = sc.nextInt();
        //숫자와 연산자 입력받음




        if (s == "+"){
            c = a+b;
            System.out.println("a+b=c");
        }







        System.out.println("정답입니다.");
        //맞았다.
        System.out.println("틀렸습니다.");
        //틀렸다.
    }


}