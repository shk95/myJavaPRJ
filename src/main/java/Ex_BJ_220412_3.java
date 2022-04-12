import java.util.Scanner;//백준 10952번

public class Ex_BJ_220412_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {//무한반복
            int A = s.nextInt();//입력 첫번째
            int B = s.nextInt();//입력 두번째
            if ((A + B) == 0) {//A,B 가 0일때
                break;//반복 종료
            } else {
                System.out.printf("%d\n", A + B);//A+B값 출력
            }
        }
    }
}