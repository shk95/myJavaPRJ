import java.util.ArrayList;
import java.util.List;

public class Ex_array_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> Collection 인터페이스 중 List,<> 부분은 String으로 값 입력.
        //list = 변수명.
        //ArrayList 는 그중 클래스

        list.add("가나다");
        list.add("마바사");
        list.add("아자차");
        list.add("타파하");

        int listSize = list.size();//size 속성으로 리스트 길이 구하기

        for (int i = 0; i < listSize; i++) {//속도가 가장 느림
            System.out.println("내용 : " + list.get(i));
        }
    }
}