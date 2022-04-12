import java.util.Scanner;//백준 11022번

public class Ex_BJ_220412_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();//테스트 케이스

        for (int i = 0; i < T; i++) {
            int A = s.nextInt();//입력 첫번째
            int B = s.nextInt();//입력 두번째

            System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, A + B);
        }
    }
}