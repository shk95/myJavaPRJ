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
class Function{
    public int num(int N) {
        int count = 0;
        int index; //자릿수 개수
        int x; //나누는수
        int num;//구해지는 수
        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                count+=1;
            }else{
                x = 1;
                index = 1;
                num = 0;
                while (i/x!=0) {
                    num = (i/x)%10;
                    x*=10;
                }
            }
        }
        return count;
    }
}