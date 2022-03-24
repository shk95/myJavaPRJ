import java.util.Scanner;

public class Ex_BJ_220324_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt(); //연도입력
        //boolean a,b,c;

        //나머지 구하기를 통해 배수인지 확인
        //Y%=4;

        //a = Y==0;
        //System.out.println("4배수"+Y+a);//확인용


        //Y%=100;

        //b = Y!=0; !잘못된부분
        //System.out.println("100배수"+Y+b);//확인용

        //Y%=400;

        //c = Y==0;
        //System.out.println("400배수"+Y+c);//확인용

        if (Y % 400 == 0)
            System.out.println("1");//400의 배수일떄
        else if (Y % 4 == 0) {
            if (Y % 100 == 0)
                System.out.println("0");//400의 배수는 아니고 4의 배수이면서 100의 배수일때
            else
                System.out.println("1");//400의 배수는 아니고 4의 배수인면서 100의 배수는 아닐때
        } else
            System.out.println("0");//400의 배수도 아니고 4의 배수도 아닐때

    }

}






