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

        //람다식을 적용
        plist.forEach(e -> System.out.println("name: " + e));

        System.out.println();

        //enhanced for
        for (String e : plist) {
            System.out.println(e);
        }

        System.out.println();

        Iterator<String> it = plist.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);

        }
    }
}
