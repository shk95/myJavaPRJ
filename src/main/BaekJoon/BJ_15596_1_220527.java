public class BJ_15596_1_220527 {
     long sum(int a[]) {
        long res = 0;
        for (int i :
                a) {
            res += i;
        }
        return res;
    }
//함수만들어보기 문제
    public static void main(String[] args) {
        int i[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BJ_15596_1_220527 a = new BJ_15596_1_220527();
        System.out.println(a.sum(i));

    }
}
