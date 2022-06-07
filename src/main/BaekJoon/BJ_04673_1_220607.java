public class BJ_04673_1_220607 {
    public static void main(String[] args) {
        int[] numArr = new int[10001];
        int x = 0;
        for (int i = 1; i < 10001; i++) {
            x = functionD(i, digitNum(i));
            if (x < 10001) {
                numArr[x] = 1;
            }
        }
       for (int i = 1; i < 10001; i++) {
            if (numArr[i] == 0) {
                System.out.println(i);
            }
        }
    }
    public static int digitNum(int n) {//자릿수구하기
        String s = Integer.toString(n);
        return s.length();
    }
    public static int functionD(int n1, int n2) {//n1 : 입력한수, n2 : 자릿수
        int result = 0;
        int num = 0, point = 1;
        for (int i = 1; i <= n2; i++) {
            num = n1 / point;
            point *= 10;
            result += num;
        }
        result += n1;
        return result;
    }
}
