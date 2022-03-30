import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Ex_BJ_220324_1 {
    public static void main(String[] args) {

        /*백준 단계별 풀어보기
            1단계 곱셈 (2588번)

        (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.


                472     (1)
               *385     (2)
         ____________   (3)
               2360     (4)
              3776      (5)
             1416       (6)
         ____________
             181720     (7)
        (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

        출력
        첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.


         */


        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int B100, B10, B1; //B 값 자릿수 지정

        B100 = B/100;//정수형이기때문에 몫을 제외한 나머지는 소수점.->생략됨.
        B10 = (B - B100*100) / 10;
        B1 = (B - B100*100 - B10*10);
        //자리수 각각 구하기

        System.out.println(A * B1);//일의 자릿수 계산
        System.out.println(A * B10);//십의 자릿수 계산
        System.out.println(A * B100);//백의 자릿수 계산

        System.out.println(A * B);//결과값 계산


        System.out.println(B100+" "+B10+" "+B1);//B 의 자릿수 확인.

    }
}