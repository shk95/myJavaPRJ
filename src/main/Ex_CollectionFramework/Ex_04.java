import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex_04 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        //리스트 인터페이스에 map 형식 (map은 String,String) 으로 정의


        Map<String, String> map = new HashMap<>();

        //list 1 추가
        map.put("name", "가나다");
        map.put("email", "dshkfsdh@djflasjf.com");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map);//리스트에 맵 정보를 저장

        map = null;//맵에 저장했던 정보들을 지움. 메모리에서 지운다.
        //list 1 완료

        //list 2 추가
        map = new HashMap<>();//메모리에 다시 올린다.

        map.put("name", "다라마");
        map.put("email", "djlfslfj@sjflsdjf.com");
        map.put("addr", "경기");
        map.put("dept", "정보보안과");

        list.add(map);

        map = null;
        //list 2 완료

        list.forEach(System.out::println);//이런방식 말고
        System.out.println("-------");

        list.forEach(Map -> {
                    System.out.println("name : " + Map.get("name"));
                    System.out.println("email : " + Map.get("email"));
                    System.out.println("addr : " + Map.get("addr"));
                    System.out.println("dept : " + Map.get("dept"));
                    System.out.println("----------------");
                }
        );
        //양식을 적용
    }
}
