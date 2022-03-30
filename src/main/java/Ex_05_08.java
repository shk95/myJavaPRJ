import java.util.Scanner;

public class Ex_05_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("점수를 입력하세요 : ");
        a = s.nextInt();

        if (a >= 90) {
            System.out.print("A");
        } else {
            if (a >= 80) {
                System.out.print("B");
            } else {
                if (a > 70) {
                    System.out.print("C");
                } else {
                    if (a >= 60) {
                        System.out.print("D");
                    } else {
                        System.out.print("F");
                    }

                }
            }
        }
        System.out.println(" 학점 입니다");
    }
}
