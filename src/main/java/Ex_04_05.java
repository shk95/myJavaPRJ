public class Ex_04_05 {
    public static void main(String[] args) {
        int a = 100, b = 200;

        System.out.printf(" %d == %d 는 %s 이다.\n", a, b, a == b);
        System.out.printf(" %d != %d 는 %s 이다.\n", a, b, a != b);
        System.out.printf(" %d > %d 는 %s 이다.\n", a, b, a > b);
        System.out.printf(" %d < %d 는 %s 이다.\n", a, b, a < b);
        System.out.printf(" %d >= %d 는 %s 이다.\n", a, b, a >= b);
        System.out.printf(" %d <= %d 는 %s 이다.\n", a, b, a <= b);


        System.out.printf(" %d = %d 는 %s 이다.\n", a, b, a = b);
        // == 이라는 같다는 표현의 잘못된 예.
    }
}
