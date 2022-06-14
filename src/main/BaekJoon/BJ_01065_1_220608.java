import java.util.Scanner;

public class BJ_01065_1_220608 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        Function f = new Function();
        //N 보다 작거나 같은 한수 개수 구하기
        int result = f.num(N);

        System.out.print(result);
    }
}
/*1부터 N 까지의 '한 수' 의 개수를 구하는 함수.
한수 : 자릿수별 숫자를 수열의 각각의 항이라 했을때, 그 수열이 등차수열을 이룬다.*/
class Function {
    int num(int N) {
        int count = 0;
        if (N < 100) {
            return N;
        }
        for (int i = 100; i <= N; i++) {
            if (ifSequence(N)) {
                count++;
            }
        }
        return count;
    }

    boolean ifSequence(int n) {

        return true;
    }
}