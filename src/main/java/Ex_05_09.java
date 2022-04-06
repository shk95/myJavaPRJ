import java.util.Scanner;

public class Ex_05_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("1 ~ 4 중에 선택하세요 : ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.print("1을 선택했다.\n");
                break;
            case 2:
                System.out.print("2을 선택했다.\n");
                break;
            case 3:
                System.out.print("3을 선택했다.\n");
                break;
            case 4:
                System.out.print("4을 선택했다.\n");
                break;
            default:
                System.out.print("이상한걸 선택했다.");

        }
    }
}
