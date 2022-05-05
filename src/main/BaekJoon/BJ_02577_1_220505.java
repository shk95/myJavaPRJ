import java.util.*;

public class BJ_02577_1_220505 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        int x = A * B * C;//세 수의 합
        //각자리의 숫자 나누기
        int i = 1;//증감
        //숫자를 각 자리마다 쪼개서 배열에 하나식 저장
        while (true) {
            int z = (x / i) % 10;
            L.add(z);
            i *= 10;
            if (x / i == 0) {//마지막자리 확인
                break;
            }
        }
        //자릿수별 숫자 개수
        for (int j = 0; j < 10; j++) {//0 부터 9까지
            int k = 0;//숫자 개수
            int S = L.size();//배열의 크기 = 자리수
            for (int m = 0; m < S; m++) {
                if(L.get(m)==j){//j 숫자가 있는지
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}