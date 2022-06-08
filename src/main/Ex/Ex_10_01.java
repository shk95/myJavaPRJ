public class Ex_10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[100] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 크다");
            System.out.println("에러 메시지 : "+e);
        }
    }
}
