import java.util.Scanner;

public class BJ_10871_1_220411 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();//수열 을 이루는 정수 개수
        int X = s.nextInt();//비교할 값

        for (int i = 0; i < N; i++) {//비교를 위해 N 번 반복필요.
            int x = s.nextInt();//비교대상 값
            if (X > x) {
                System.out.printf("%d ", x);
            }
        }
    }
}



