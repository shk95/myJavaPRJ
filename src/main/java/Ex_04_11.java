public class Ex_04_11 {
    public static void main(String[] args) {
        //비트 연산 관련 자습

        byte a = 'A', b;
        byte mask = 0x0F;

        System.out.printf("%X & %X = %X \n", a, mask, a & mask);//논리곱 및 논리합
        System.out.printf("%X | %X = %X \n", a, mask, a | mask);

        mask = 'a' - 'A';

        b = (byte) (a ^ mask);
        System.out.printf("%c ^ %d = %c \n", a, mask, b);
        a = (byte) (b ^ mask);
        System.out.printf("%c ^ %d = %c \n", b, mask, a);

    }
}
