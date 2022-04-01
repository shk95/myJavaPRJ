import java.util.Scanner;

public class Ex_04_13 {
    public static void main(String[] args) {
        int a = 10;
        int b;
        Scanner s = new Scanner(System.in);

        System.out.printf("시프트 대상 숫자 = %d\n",a);
        System.out.print("시프트 횟수 입력");
        b = s.nextInt();

        System.out.println(a << b);


        System.out.printf("%d 를 왼쪽 1회 시프트하면 %d 이다.\n", a, a << 1);//2 의 시프트횟수제곱 만큼 된다.
        System.out.printf("%d 를 왼쪽 2회 시프트하면 %d 이다.\n", a, a << 2);
        System.out.printf("%d 를 왼쪽 3회 시프트하면 %d 이다.\n", a, a << 3);

    }
}
