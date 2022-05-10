import java.util.*;

public class BJ_01546_1_220510 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Float> list = new ArrayList<>();

        int listSize = s.nextInt();
        //과목의 개수

        for (int i = 0; i < listSize; i++) {
            list.add(s.nextFloat());
        }
        //과목별 점수들

        float M;//최댓값
        int j = 0;//최댓값 인덱스

        for (int i = 1; i < listSize; i++) {
            if (list.get(j) < list.get(i)) {
                j = i;
            }
        }

        M = list.get(j);

        float x = 0;//출력값

        for (int i = 0; i < listSize; i++) {
            x += list.get(i);
        }

        x = x / M * 100 / listSize;

        System.out.println(x);
    }
}
