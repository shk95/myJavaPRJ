import java.util.Scanner;
public class CU_1368_1_220418 {//코드업 1368. 수정 필요.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int h = s.nextInt();//높이
        //int k = s.nextInt();//및변길이
        //String d = s.nextLine();//기울어짐방향
        String[] str = s.nextLine().split(" ");//입력값이 한줄에 공백으로 구분되기때문에
        int h = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        char d = str[2].charAt(0);//그중 첫번째 글짜로 받는다.


        //평행사변형의 방향 d 에 따라 왼쪽인지 오른쪽인지
        //if (Objects.equals(d, "L")){//IF 문을 사용하는게 맞는지 모르겠다.비교문도 수정필요
        if (d == 'L') {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int l = 0; l < k; l++) {
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
