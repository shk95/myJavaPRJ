import java.util.Scanner;

public class Ex_06_11_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0, num1, num2, num3;

        System.out.print("시작값 입력 : ");
        num1 = s.nextInt();
        System.out.print("끝값 입력 : ");
        num2 = s.nextInt();
        System.out.print("증가값 입력 : ");
        num3 = s.nextInt();

        if (num1 < num2) {//시작값이 끝값보다 클시 에러를 출력하도록 추가
            for (int i = num1; i <= num2; i += num3) {
                hap += i;
            }
            System.out.printf("%d 에서 %d 까지 %d 씩 증가한 값 끼리의 합: %d.\n", num1, num2, num3, hap);
        } else {
            System.out.print("끝값이 시작값보다 작아서 실패");
        }
    }
}


