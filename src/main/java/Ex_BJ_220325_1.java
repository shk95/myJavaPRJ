import java.util.Scanner;

public class Ex_BJ_220325_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H, M, T;

        H = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();

        if ((M + T) < 60)//타이머 + 현재 분 이 60보다 작은경우
            System.out.printf("%d %d", H, M + T);
        else {
            H = (H * 60 + M + T) / 60;
            M = (H * 60 + M + T) % 60;

            if (H > 23)//시간 이 23 보다 큰경우


                System.out.printf("%d %d", H - 24, M);

            else//총 계산한 H 가 23이하인경우
                System.out.printf("%d %d", H, M);
        }


    }
} 