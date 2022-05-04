import java.util.Scanner;

public class Exam13 {
    public static void main(String[] args) {

        while(true) {//반복구문 추가
        Scanner s = new Scanner(System.in);

            int x, y;
            String[] str;
            System.out.print("수식을 한줄로 띄어쓰기 입력하세요 : ");
            str = s.nextLine().split(" ");

            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[2]);
            char a = str[1].charAt(0);


            switch (a) {
                case '+':
                    System.out.printf("%d %c %d = %d\n", x, a, y, x + y);
                    break;
                case '-':
                    System.out.printf("%d %c %d = %d\n", x, a, y, x - y);
                    break;
                case '*':
                    System.out.printf("%d %c %d = %d\n", x, a, y, x * y);
                    break;
                case '/':
                    float result = x / (float) y;
                    System.out.printf("%d %c %d = %f\n", x, a, y, result);
                    break;
                case '%':
                    System.out.printf("%d %c %d = %d\n", x, a, y, x % y);
                    break;
                default:
                    System.out.print("연산자를 잘못 입력했습니다.\n");
            }
            System.out.print("종료하시겠습니까? : y or n");
            char exit = s.next().charAt(0);
            if(exit == 'y'){
                break;
            }


        }

    }
}
