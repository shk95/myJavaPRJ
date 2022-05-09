import java.util.Scanner;

public class BJ_03052_2_220509 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[42];//42로 나눈다면 나머지는 41까지 이기에..
        int cnt = 0;
        int n;
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            nums[n % 42] = 1;//나머지가 존재하는 부분에 카운트.자연스럽게 중복이 제거됨.
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);//카운트 개수
    }
}