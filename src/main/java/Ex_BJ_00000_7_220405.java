import java.util.Scanner;//백준 구구단
public class Ex_BJ_00000_7_220405{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);//문자 N 입력
        int a = 1,b;
        b = s.nextInt();

        System.out.printf("%d * %d = %d\n",b,a,a*b);//증가연산자 활용
        System.out.printf("%d * %d = %d\n",b,++a,a*b);
        System.out.printf("%d * %d = %d\n",b,++a,a*b);
        System.out.printf("%d * %d = %d\n",b,++a,a*b);
        System.out.printf("%d * %d = %d\n",b,++a,a*b);
        System.out.printf("%d * %d = %d\n",b,++a,a*b);
        System.out.printf("%d * %d = %d\n",b,++a,a*b);
        System.out.printf("%d * %d = %d\n",b,++a,a*b);
        System.out.printf("%d * %d = %d\n",b,++a,a*b);


    }
}
