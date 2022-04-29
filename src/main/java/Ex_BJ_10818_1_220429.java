import java.util.Scanner;
//주어진 N 개의 정수 중 최대값과 최솟값 출력.
public class Ex_BJ_10818_1_220429 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;//정수 개수
        N = s.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = s.nextInt();
        }//정수 목록 입력
        if (N != 1) {//정수 개수가 한개일때는 에러를 유발
            int x = 0, y = 1;
            while (true) {
                if (a[x] > a[y]) {
                    y++;
                } else {
                    x = y++;
                }
                if (y == N) {
                    break;
                }
            }
            int n1 = a[x];//최댓값
            x = 0;
            y = 1;
            while (true) {
                if (a[x] < a[y]) {
                    y++;
                } else {
                    x = y++;
                }
                if (y == N) {
                    break;
                }
            }
            int n2 = a[x];//최솟값
            System.out.println(n2 + " " + n1);
        } else {//주어진 정수 개수가 1개일때
            System.out.println(a[0] + " " + a[0]);
        }
    }
}
