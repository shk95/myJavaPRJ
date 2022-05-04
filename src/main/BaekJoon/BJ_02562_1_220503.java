import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//컬렉션프레임워크 이용. 최대값찾기
public class BJ_02562_1_220503 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n;

        while (s.hasNext()) {
            n = s.nextInt();
            list.add(n);
        }

        int i = list.size();
        int x = 0, y = 1;

        for (int j = 0; j < i; j++) {//최댓값 찾기
            if (list.get(x) > list.get(y)) {
                y++;
            } else {
                x = y++;
            }
            if (y == i) {
                break;
            }
        }
        System.out.println(list.get(x));//최댓값결과
        System.out.printf("%d", x + 1);//최댓값의 번호


    }
}