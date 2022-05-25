import java.util.Scanner;

//함수 사용하기
public class Ex_09_11_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//new 를통해 메모리에 올리는 방법

        Ex_09_11_1 a = new Ex_09_11_1();

        int coffee;
        int ret;

        System.out.print("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙)\n");
        coffee = s.nextInt();

        ret = a.coffee_machine(coffee);

        System.out.println("손님 ~ 커피 여기 있습니다.\n");

        System.out.println(ret + "으로 종료");
    }

}
