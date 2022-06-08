public class Ex_10_02 {
    public static void main(String[] args) {
        int [] aa = new int[3];
        try {
            aa[3] = 100;
            aa[2] = 100 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 크다");
            System.out.println("에러 원인 : "+e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 것 등의 오류");
            System.out.println("에러 원인 : "+e);
        }finally {
            System.out.println("무조건 실행되는 finally 부분");
        }
    }
}
