import java.util.Scanner;

public class Ex_06_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0, i, num;

        System.out.println("1 에서 부터 입력한 값 까지의 합");
        System.out.print(" 값 입력 : ");
        num = s.nextInt();

        for (i = 1; i <= num; i++) {
            hap += i;
        }
        System.out.printf(" 1 에서 %d 까지의 합 : %d \n", num, hap);

    }
}
