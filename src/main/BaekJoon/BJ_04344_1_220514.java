import java.util.*;
public class BJ_04344_1_220514{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int C = s.nextInt();
        for(int i = 0; i < C; i++){
            List<Integer> list = new ArrayList<>();
            int N = s.nextInt();
            float sum = 0;
            float cnt = 0;
            for(int j = 0; j < N; j++){
                int x = s.nextInt();
                list.add(x);
                sum+=x;
            }
            float avg = sum/N;
            for(int j = 0; j < N; j++){
                int y = list.get(j);
                if(avg<y){
                    cnt++;
                }
            }
            System.out.printf("%2.3f%%\n",cnt/N*100);//%출력방법 까먹었었다
            //list = null;어짜피 지역내에서 선언되어서 없어도 될거같다.
        }
    }
}