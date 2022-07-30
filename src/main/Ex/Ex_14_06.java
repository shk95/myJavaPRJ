import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_14_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> s = new ArrayList<>();

        while (scan.hasNext()) {
            s.add(scan.nextInt());
        }

        Integer maxVal, minVal;
        int len = s.size();
        int i, k;

        System.out.print("정렬 전 ==> ");
        for (i = 0; i <len; i++) {
            System.out.print(s.get(i) + " ");
        }

        //선택정렬 구현
        for (i = 0; i < len-1; i++) {
            for (k = i+1; k < len; k++) {
                maxVal = Math.max(s.get(i), s.get(k));
                minVal = Math.min(s.get(i), s.get(k));
                s.set(i, minVal);
                s.set(k, maxVal);
            }
        }

        System.out.print("\n정렬 후 ==> ");
        for (i = 0; i < len; i++) {
            System.out.print(s.get(i) + " ");
        }
    }
}
