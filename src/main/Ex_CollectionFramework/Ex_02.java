import java.util.*;

public class Ex_02 {
    public static void main(String[] args) {
        List<String> plist = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            plist.add(s.next());
        }
        System.out.println("다음은 출력");
        System.out.println();

        plist.forEach(e -> System.out.println(e));
        //람다식을 적용
        System.out.println();

        for (String e : plist) {
            System.out.println(e);
        }
        //foreach 방식
        System.out.println();
    }
}
