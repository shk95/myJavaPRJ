public class Ex_06_08_2 {
    public static void main(String[] args) {
        int a, i;
        a = 1;
//5! 를 구한다는 예

        for (i =5; i >0; i--) {//좀더 나은방법
            a *= i;
        }
        System.out.printf("5! : %d", a);
    }

}
