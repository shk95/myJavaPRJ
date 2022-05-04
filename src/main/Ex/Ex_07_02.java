public class Ex_07_02 {
    public static void main(String[] args) {
        int hap = 0, i;

        i = 1;
        while (i <= 10) {
            hap = hap + i;
            i++;
        }
        System.out.printf(" 1 에서 10 까지의 합 : %d \n", hap);
    }
}
