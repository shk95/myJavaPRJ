public class Ex_test_04 {
    public static void main(String[] args) {
        int x = 50;
//50에서 100까지 더하는데 3,7,11 의 배수는 제외하는 문제.

        for (int i = 51; i < 101; i++) {
            if ((i % 3 == 0) || (i % 7 == 0) || (i % 11 == 0)) {
                continue;
                // }else{
                //System.out.println(i);
            }
            x = x + i;

        }
        System.out.println(x);

        x = 50;
        for (int i = 51; i < 101; i++) {
            if ((i % 3 != 0) && (i % 7 != 0) && (i % 11 != 0)) {
                x = x + i;
            }

        }
        System.out.println(x);

        x = 50;

        for (int i = 51; i < 101; i++) {
            if (!((i % 3 == 0) || (i % 7 == 0) || (i % 11 == 0))) {
                x = x + i;
            }
        }
        System.out.println(x);
    }
}
//논리연산 관계 정확히..

