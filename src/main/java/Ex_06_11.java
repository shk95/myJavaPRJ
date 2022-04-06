import java.util.Scanner;

public class Ex_06_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0, num1, num2, num3;

        System.out.print("시작값 입력 : ");
        num1 = s.nextInt();
        System.out.print("끝값 입력 : ");
        num2 = s.nextInt();
        System.out.print("증가값 입력 : ");
        num3 = s.nextInt();

        for (int i = num1; i <= num2; i += num3) {
            hap += i;
        }
        System.out.printf("%d 에서 %d 까지 %d 씩 증가한 값 끼리의 합: %d.\n",num1,num2,num3,hap);
    }
}


