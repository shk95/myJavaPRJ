import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_08958_1_220513 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int n = 0;
            int k = 1;
            int sum = 0;
            String str = s.next();
            int length = str.length();
            List<Character> list = new ArrayList<>();
            do {
                list.add(str.charAt(n));
                char c = list.get(n);
                if (c == 'O') {
                    sum += k;
                    k++;
                } else {
                    k = 1;
                }
                n++;
            } while (length != n);

            list = null;

            System.out.println(sum);
        }
    }
}