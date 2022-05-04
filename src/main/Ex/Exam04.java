import java.util.Scanner;

//정수를 여러 진수로 변환출력
public class Exam04 {
    public static void main(String[] args) {
        int data;
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하세요 ==>");
        data = s.nextInt();

        System.out.printf("10진수 ==> %d \n", data);
        System.out.printf("16진수 ==> %x \n", data);
        System.out.printf("8진수 ==> %o \n", data);
    }
}
