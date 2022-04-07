import java.util.Scanner;
public class Ex_BJ_220405_1_1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        //구구단 만들기
        //for 구문 사용, 메모리 나 속도는 차이가 안난다...
        for (int i = 1; i<10; i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
    }
}