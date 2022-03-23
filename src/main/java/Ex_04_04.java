public class Ex_04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++;
        System.out.printf("%d \n", b);
        // b = a 와 a++는 다른 시점
        //b = 10, a = 11 이 된다.

        b = ++a;
        System.out.printf("%d \n", b);
        //a = 11 인 상태 에서 a 가 12 가 된후 b 에 대입.

    }
}
