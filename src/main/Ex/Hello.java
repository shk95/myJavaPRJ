import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        List<String> pList = new ArrayList<>();

        pList.add("홍길동");
        pList.add("이협건");
        pList.add("고길동");
        pList.add("둘리");

        //Iterator<String> it = pList.iterator();
        for (String a : pList
        ) {
            System.out.println(a);

        }
    }
}


