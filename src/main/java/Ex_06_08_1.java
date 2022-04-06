public class Ex_06_08_1 {
    public static void main(String[] args) {
        int a, i;
        a = 1;
//5! 를 구한다는 예
        for (i = 1; i <= 5; i++) {
            a = a * i;
        }
        System.out.printf("5! : %d", a);
    }

}
