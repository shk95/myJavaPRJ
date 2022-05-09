import java.util.*;

public class BJ_03052_1_220506 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //특정 숫자 나열을 42(변수 B)로 나눈후 나머지 개수(중복제외) 구하기
        //중복을 제외하고, 원래 배열의 순서대로 새로운 배열 생성.
        List<Integer> L = new ArrayList<>();//초기 데이터 입력
        List<Integer> L2 = new ArrayList<>();//중복 제거된 리스트

        int A, B = 42;

        while (s.hasNext()) {
            A = s.nextInt();
            L.add(A % B);
        }
        int sizeL = L.size();//L 의 크기값
        int i = 1;//L 배열의 인덱스
        int j = 0;//카운터
        int k = 0;//카운터

        L2.add(L.get(0));//첫번째 값은 중복이 없으므로 가져온다

        do {
            for (; k < L2.size(); k++) {//중복검사
                if (Objects.equals(L.get(i), L2.get(k))) {
                    j++;//중복이 있다면 카운트
                }
            }
            if (j == 0) {//중복이 없을때 기존 L 에서 L2 로 가져온다
                L2.add(L.get(i));
            }
            i++;
            j = 0;//카운트 초기화
            k = 0;//카운트 초기화
        } while (i != sizeL);

        int sizeL2 = L2.size();
        System.out.print(sizeL2);//중복을 제외한 나머지들의 개수
    }
}
