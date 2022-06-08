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
class Function{
    public int num(int n) {

        int result = 0;

        return result;
    }
}