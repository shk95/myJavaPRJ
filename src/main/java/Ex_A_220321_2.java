import java.util.Scanner;

public class Ex_A_220321_2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);




                int a = sc.nextInt();
                if (a <= 100 & a >= 90) {
                    System.out.println("성적은 A 입니다");
                } else if (a <= 89 & a >= 80) {
                    System.out.println("성적은 B 입니다");
                } else if (a <= 79 & a >= 70) {
                    System.out.println("성적은 C 입니다");
                } else if (a <= 69 & a >= 60) {
                    System.out.println("성적은 D 입니다");
                } else if (a<=59&a>=0) {
                        System.out.println("성적은 F 입니다");
                } else {
                    System.out.println("잘못된 성적 입니다");
                }



    }



}
