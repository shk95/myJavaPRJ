import java.util.Scanner;
public class Ex_CU_1371_1_220414{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//코드업 문제 1371 마름모 출력

        for (int i = 0; i < n; i++){//가로
            for (int j = i; n-j > 1; j++){
                System.out.print(" ");//첫번째 공백
            }
            System.out.print("*");//첫번째 별
            for (int k = 0; i*2>k; k++){
                System.out.print(" ");//두번째 공백
            }
            System.out.print("*");//두번째 별
            System.out.println();//줄변경
        }
        for (int i = 0; i < n; i++){//뒤집어서
            for (int j = 0; j < i; j++){
                System.out.print(" ");//처음 공백
            }
            System.out.print("*");//첫번째 별
            for (int k = 0; k < (n-i-1)*2; k++){
                System.out.print(" ");//두번째 공백
            }
            System.out.print("*");//두번째 별
            System.out.println();//줄변경
        }

    }
}
