import java.util.Objects;
import java.util.Scanner;
public class Ex_CU_220418_1{//코드업 1368. 수정 필요.
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();//높이
        int k = s.nextInt();//및변길이
        String d = s.nextLine();//기울어짐방향
        System.out.println(d);//확인용
        //평행사변형의 방향 d 에 따라 왼쪽인지 오른쪽인지
        if (Objects.equals(d, "L")){//IF 문을 사용하는게 맞는지 모르겠다.비교문도 수정필요
            for (int i = 0; i < h; i++){
                for (int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                for (int l = 0; l < k; l++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }else{
            for (int i = 0; i < h; i++){
                for (int j = h-i-1; j > 0; j--){
                    System.out.print(" ");
                }
                for (int l = 0; l < k; l++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }

    }
}