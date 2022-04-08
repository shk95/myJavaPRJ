import java.util.Scanner;//입력된 값 에서부터 1까지 출력

public class Ex_BJ_220408 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 0; a > i; a--) {
            System.out.printf("%d\n", a);
        }
    }
}