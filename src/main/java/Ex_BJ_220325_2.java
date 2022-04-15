
import java.util.Scanner;

public class Ex_BJ_220325_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;//각각 주사위 눈금
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int A = (10000 + a * 1000);//같은눈 3개 일때의 상금
        int B = (1000 + a * 100);//같은눈 2개 일때읠 상금


        if (a == b) {//a b 같을때
            if (a == c)//a b 와 c 같을때
                System.out.println(A);
            else//a b 같고 c 는 다를때

                System.out.println(B);
        } else//a b 다를때

        {
            if (a == c)//a 와 는 다르지만 a c 같을때

                System.out.println(B);
            else {//a b 다르고 a c 다를때


                if (b == c) {//a b 다르고 a c 다르고 bc 같을때
                    B = 1000 + b * 100;
                    System.out.println(B);
                } else {//a 와 b 와 c 다를때
                    if (a > b) {
                        if (a > c)
                            System.out.println(a * 100);
                        else
                            System.out.println(c * 100);
                    } else {
                        if (b > c)
                            System.out.println(b * 100);
                        else
                            System.out.println(c * 100);
                    }
                }
            }
        }


    }
}
