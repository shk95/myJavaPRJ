import java.util.HashMap;
import java.util.Map;

public class Ex_03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("email", "fjsldfsjlf@djlsjlkfd.com");
        map.put("dept", "데이터분석과");
        //값 저장
        System.out.println("다음은 출력값");

        System.out.println(map.get("name"));
        System.out.println(map.get("email"));
        System.out.println(map.get("dept"));
        //값 가져오기

        System.out.println();
    }
}
