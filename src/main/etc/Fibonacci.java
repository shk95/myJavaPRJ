import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt() + 1;
        System.out.print("피보나치수열\n");
        for (int i = 1; i < num; i++) {
            int x = Fibonacci_recursive(i);
            System.out.print(i + "항 : " + x + "\n");
        }
        System.out.print("피보나치수열\n");
        for (int i = 1; i < num; i++) {
            int x = Fibonacci_loop(i);
            System.out.print(i + "항 : " + x + "\n");
        }
    }

    public static int Fibonacci_recursive(int n) {
        if (n <= 2) {
            return 1;
        } else {
            //재귀적 함수사용.
            return Fibonacci_recursive(n - 1) + Fibonacci_recursive(n - 2);
        }
    }

    public static int Fibonacci_loop(int n) {
        if (n <= 2) {
            return 1;
        }
        int result = 0;
        int lastNumber1 = 1;
        int lastNumber2 = 1;
        for (int i = 2; i < n; i++) {
            result = lastNumber1 + lastNumber2;
            lastNumber1 = lastNumber2;
            lastNumber2 = result;
        }
        return result;
    }
}

