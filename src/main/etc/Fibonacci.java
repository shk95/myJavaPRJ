import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt()+1;
        System.out.print("피보나치수열\n");
        for (int i = 1; i < num; i++) {
            int x = function(i);
            System.out.print(i+"항 : "+x+"\n");
        }
    }
    public static int function(int n) {
        if(n<=2){
            return 1;
        }else{
            //재귀적 함수사용.
            return function(n-1)+function(n-2);
        }
    }
}

