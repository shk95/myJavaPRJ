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
        while (true) {
            int z = (x / i) % 10;
            L.add(z);
            i *= 10;
            if (x / i == 0) {
                break;
            }
        }
        Iterator<Integer> it = L.iterator();
        int j;
        for (j = 0; j < 10; j++) {
            int k = 0;
            int a;
            while (it.hasNext()) {
                a = it.next();
                if (a == j) {
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}