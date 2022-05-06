import java.util.*;

public class BJ_03052_1_220506 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> L = new ArrayList<>();

        int A, B = 42;

        while (s.hasNext()) {
            A = s.nextInt();
            L.add(A % B);
        }
        int k = 0;
        //수정중

        /*for (int i = 0; i < L.size(); i++){
            int x = L.get(i);
            for (int j = 0; j < L.size(); j++) {
                int y = L.get(j);
                if (x!=y) {
                    k++;
                }
            }
        }
        System.out.println(L.size()-k);*/
    }
}
