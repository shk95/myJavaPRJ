public class Ex_04_01 {
    public static void main(String[] args) {
        int a, b = 5, c = 3;

        a = b + c;
        System.out.printf(" %d + %d = %d \n", b, c, a);

        a = b - c;
        System.out.printf(" %d = %d = %d \n", b, c, a);

        a = b * c;
        System.out.printf(" %d * %d = %d \n", b, c, a);

        a = b / c;
        System.out.printf(" %f / %f = %f \n", (float)b, (float)c, (float)a);
        //정수형 을 숫자로 변환해봄
        a = b % c;
        System.out.printf(" %d %% %d = %d \n", b, c, a);

    }
}
