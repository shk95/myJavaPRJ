public class Ex_04_02 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.printf(" %d + %d - %d = %d \n", a, b, c, result1);

        result1 = a + b * c;
        System.out.printf(" %d + %d * %d = %d \n", a, b, c, result1);

        result2 = a * b / (float) c;
        System.out.printf(" %d * %d / %d = %3.1f \n", a, b, c, result2);
        //자릿수 지정
        mok = c / b;
        System.out.printf(" %d / %d 의 몫은 %d \n", c, b, mok);

        namugi = c % b;
        System.out.printf(" %d / %d 의 나머지는 %d \n", c, b, namugi);


    }
}
