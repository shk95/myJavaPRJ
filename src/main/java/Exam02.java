import java.util.Scanner;

public class Exam02 {//초를 입력받으면 시, 분, 초로 변환 예제 복습

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;

        System.out.print("계산할 초는? ===>");
        t = sc.nextInt();

        System.out.printf("%d 시간\n",t/3600);
        System.out.printf("%d 분\n", t / 60);
        System.out.printf("%d 초\n", t);

    }
}
