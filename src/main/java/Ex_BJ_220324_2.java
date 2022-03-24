import java.util.Scanner;

public class Ex_BJ_220324_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //연도입력
        boolean a,b,c;

        //나머지 구하기를 통해 배수인지 확인
        A%=4;
        System.out.println(A);//확인용
        a = A==0;
        System.out.println(a);//확인용
        A%=100;
        b = A!=0;
        A%=400;
        c = A==0;
        if ((a&&b)||c){

            System.out.println("1");}
        else{

            System.out.println("0");}


    }


}