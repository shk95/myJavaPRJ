import java.util.Scanner;

public class Ex_08_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap;

        System.out.print("1번째 숫자를 입력하세요 : ");
        aa[0] = s.nextInt();
        System.out.print("2번째 숫자를 입력하세요 : ");
        aa[1] = s.nextInt();
        System.out.print("3번째 숫자를 입력하세요 : ");
        aa[2] = s.nextInt();
        System.out.print("4번째 숫자를 입력하세요 : ");
        aa[3] = s.nextInt();

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf(" 합계 = %d \n", hap);

        for (int i = 0; i < 4; i++) {
            System.out.println("aa[" + i + "] = " + aa[i]);
        }

    }
}
