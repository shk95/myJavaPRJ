import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
            long a, r, n;
            a = s.nextLong();
            r = s.nextLong();
            n = s.nextLong();
            for(int i = 0; i<n-1; i++){
                a*=r;
            }
            System.out.printf("%d",a);

    }
}


