import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex_05 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("이름", "강석현");
        map.put("전공", "데이터분석");
        map.put("학번", "1");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("이름", "홍길동");
        map.put("전공", "정보보안");
        map.put("학번", "2");

        list.add(map);

        map = null;


        int listsize = list.size();

        for (int i = 0; i < listsize; i++) {
            Map rMap = list.get(i);
            System.out.println("이름 : " + rMap.get("이름"));
            System.out.println("전공 : " + rMap.get("전공"));
            System.out.println("학번 : " + rMap.get("학번"));
        }
        System.out.println("==========================");

        for (Map rMap : list) {
            System.out.println("이름 : " + rMap.get("이름"));
            System.out.println("전공 : " + rMap.get("전공"));
            System.out.println("학번 : " + rMap.get("학번"));
        }

    }
}
