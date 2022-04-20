public class Ex_test_04 {
    public static void main(String[] args) {
        int x = 50;

        for (int i = 51; i < 101; i++) {
            if ((i % 3 == 0) || (i % 7 == 0) || (i % 11 == 0)) {
                continue;
                // }else{
                //System.out.println(i);
            }
            x = x + i;

        }
        System.out.println(x);
    }
}
