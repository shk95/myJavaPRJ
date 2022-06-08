import java.util.Scanner;

public class Ex_10_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = 100, b = s.nextInt() ;
            System.out.print("a/b 의 결과 출력\na = 100\nb 의 값 입력\n");
            try {
                if (b == 0) {
                    throw new Exception("0으로 나눌수 없습니다.");
                }
                int result = a/b;
                System.out.println(result);
            } catch (Exception e) {
                System.out.print("발생 오류 : ");
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
    }
}
