import java.util.Scanner;
//예제 복습
public class Ex_04_0_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b, result;

        System.out.printf("첫번째 계산할 값 입력 ==>");
        a = sc.nextFloat();
        System.out.printf("두번째 계산할 값 입력 ==>");
        b = sc.nextFloat();

        result = a + b;
        System.out.printf("%5.2f + %5.2f = %5.2f \n", a, b, result); //실수 덧샘연산

        result = a - b;
        System.out.printf("%5.2f - %5.2f = %5.2f \n", a, b, result); //실수 뺄샘연산

        result = a * b;
        System.out.printf("%5.2f * %5.2f = %5.2f \n", a, b, result); //실수 곱셈연산

        result = a / b;
        System.out.printf("%5.2f / %5.2f = %5.2f \n", a, b, result); //실수 나눗셈 연산

        result = (int) a % (int) b;
        System.out.printf("%d %% %d = %d \n", (int) a, (int) b, (int) result); //나머지 연산 (정수로)


    }

}
