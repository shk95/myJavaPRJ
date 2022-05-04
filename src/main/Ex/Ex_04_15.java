public class Ex_04_15 {
    public static void main(String[] args) {
        int a = 100, result;
        int i;

        for (i = 1; i <= 5; i++) {//왼쪽 시프트 5번
            result = a << i;
            System.out.printf("%d <<%d = %d\n", a, i, result);
            }

        for (i = 1; i <= 5; i++) {//오른쪽 시프트 5번
            result = a >> i;
            System.out.printf("%d >>%d = %d\n", a, i, result);
        }


    }
}
