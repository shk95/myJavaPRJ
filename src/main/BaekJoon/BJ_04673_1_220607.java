public class BJ_04673_1_220607 {
    public static void main(String[] args) {
        /*셀프넘버를 1~10000까지 구함. 셀프 넘버가 아닌것을 배열 인덱스
        0~10000번에 카운트, 카운트가 안된 배열의 인덱스를 출력하는 방식으로
        값 구함.     */
        int[] numArr = new int[10001];
        int num = 0;
        for (int i = 1; i < 10001; i++) {
            num = functionD(i, digitNum(i));
            if (num < 10001) {
                numArr[num] = 1;
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
            num = (n1/point)%10;
            point *= 10;
            result += num;
        }
        result += n1;
        return result;
    }
}
