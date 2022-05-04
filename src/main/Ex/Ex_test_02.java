import java.util.Scanner;

public class Ex_test_02 {
    public static void main(String[] args) {
        //수업 테스트 22.03.30
        //3의 배수인지, 5의 배수인지, 3과5의 배수인지.
        Scanner s = new Scanner(System.in);

        int a;
        a = s.nextInt();


        if (a % 15 == 0) {
            System.out.println("3 과 5 의 배수 입니다");
        } else if (a % 3 == 0) {
            System.out.println("3 의 배수 입니다.");
        } else if (a % 5 == 0) {
            System.out.println("5 의 배수 입니다.");
        } else {
            System.out.println("3 또는 5 의 배수가 아닙니다.");
        }

    }
}

