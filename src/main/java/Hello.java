//import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws IOException {
        // Scanner s = new Scanner(System.in);

        //char ch = (char)System.in.read();
        //System.out.println(ch);
        Scanner s = new Scanner(System.in);

        String[] a = new String[4];
        for (int i = 0; i < 4; i++) {

            String ss = s.nextLine();
            a[i] = ss;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i]);
        }
    }

}


