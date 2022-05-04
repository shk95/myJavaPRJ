import java.util.Scanner;

public class Ex_07_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while (true) {//무한루프 계산기

            System.out.print("첫번째 입력할 값 : ");
            int a = s.nextInt();
            System.out.print("두번째 입력할 값 : ");
            int b = s.nextInt();

            System.out.printf("%d + %d = %d \n", a, b, a + b);
        }
    }
}
