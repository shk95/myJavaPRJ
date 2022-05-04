import java.util.*;

//컬렉션프레임워크 추가적으로 사용
public class BJ_10951_1_220504 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        int A, B;

        while (s.hasNext()) {
            A = s.nextInt();
            B = s.nextInt();
            l.add(A + B);
        }
        Iterator<Integer> i = l.iterator();

        while (i.hasNext()) {
            int x = i.next();
            System.out.println(x);
        }
    }
}