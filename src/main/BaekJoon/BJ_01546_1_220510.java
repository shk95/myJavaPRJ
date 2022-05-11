import java.util.*;

public class BJ_01546_1_220510 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Float> list = new ArrayList<>();

        int listSize = s.nextInt();//과목의 개수
        float x = 0;//출력값
        float M = 0;//최댓값

        for (int i = 0; i < listSize; i++) {
            list.add(s.nextFloat());
            x += list.get(i);//하나에 합쳐서 시간 단축
            M = Math.max(M, list.get(i));//매스 클래스 맥스 메소드
        }
        //과목별 점수들

        x = x / M * 100 / listSize;

        System.out.println(x);
    }
}