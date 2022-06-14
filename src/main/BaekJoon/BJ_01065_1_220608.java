import java.util.Scanner;

public class BJ_01065_1_220608 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        Function f = new Function();
        //N 보다 작거나 같은 한수 개수 구하기
        System.out.print(f.num(N));
    }
}
/*1부터 N 까지의(1000이하) '한 수' 의 개수를 구하는 함수.
한수 : 자릿수별 숫자를 수열의 각각의 항이라 했을때, 그 수열이 등차수열을 이룬다.*/


class Function {
    //한수 인지 체크해서 개수를 센다.
    int num(int N) {
        int count = 99;
        //100 미만은 무조건 한 수.
        if (N < 100) {
            return N;
        } else {
            for (int i = 100; i <= N; i++) {
                if (ifSequence(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    /*한 수 를 이루는 수열인지 확인. 맞으면 true 리턴. 100이상에서 작동*/
    boolean ifSequence(int N) {
        //자릿수별로 잘라서 배열에 저장.
        int i = 1;
        int k = 0;//인덱스
        int[] num = new int[4];
        while (N / i!= 0) {
            num[k] = (N / i) % 10;
            i *= 10;
            k++;
        }
        //결과 k = 자리의 개수가 됨.
        //공차를 구해서 새로운 배열에 저장
        int[] newNum = new int[k-1];
        for (int j = 0; j < newNum.length; j++) {
            newNum[j] = num[j + 1] - num[j];
        }
        boolean check = false;
        for (int m = 0; m < newNum.length; m++) {
            if (newNum[0] == newNum[m]) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }
}