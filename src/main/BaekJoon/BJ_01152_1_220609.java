import java.util.Scanner;

public class BJ_01152_1_220609 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().trim();

        String[] strArr = str.split(" ");
        if (strArr[0].equals("")) {
            System.out.print(0);
        } else {
            System.out.print(strArr.length);
        }
    }
}
