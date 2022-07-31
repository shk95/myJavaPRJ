import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam38 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("정렬할 숫자 입력 : ");
        if (s.hasNext()) {
            do {
                list.add(s.nextInt());
            } while (s.hasNext());
        }

        int listSize = list.size();

        System.out.print("정렬 전 숫자 : ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        //버블정렬 구현
        int tmp;
        for (int i = 0; i < listSize - 1; i++) {
            for (int k = 0; k < listSize - 1 - i; k++) {
                if (list.get(k) > list.get(k + 1)) {
                    tmp = list.get(k + 1);
                    list.set(k + 1, list.get(k));
                    list.set(k, tmp);
                }
            }
        }

        System.out.print("\n정렬 후 숫자(오름차순) : ");
        for (int i : list) {
            System.out.print(i+" ");
        }
    }
}
