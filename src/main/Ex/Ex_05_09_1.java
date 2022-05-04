import java.util.Scanner;//switch 대신 if 구문 사용

public class Ex_05_09_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("1 ~ 4중 선택 : ");
        a = s.nextInt();

        if (a == 1) {
            System.out.print("1 을 선택하였다");
        } else if (a == 2) {
            System.out.print("2 를 선택하였다");
        } else if (a == 3) {
            System.out.print("3 를 선택하였다");
        } else if (a == 4) {
            System.out.print("4 를 선택하였다");
        } else
            System.out.print("다른걸 선택하였다");
    }
}
