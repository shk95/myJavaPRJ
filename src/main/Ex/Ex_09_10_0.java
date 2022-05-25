public class Ex_09_10_0 {
    public static void main(String[] args) {
        int i = 1, j = 10;

        int k = function(i, j);
        System.out.println(k);
    }

    public static int function(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }
}
