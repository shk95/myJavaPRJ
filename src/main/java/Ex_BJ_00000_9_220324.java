
import java.util.Scanner;
public class Ex_BJ_00000_9_220324{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int H1,M1,htm,H2,M2;
        H1 = sc.nextInt();
        M1 = sc.nextInt();
        //시간은 24시간제




        if (H1==0){
            if (M1<45){
                M2 = M1+15;
            System.out.println("23 "+M2);}
                     else{
            M2 = M1-45;
            System.out.println("0 "+M2);}
        }
        else{
            htm = (H1*60+M1)-45; //일반적인 조건
        H2 = htm/60;
        M2 = htm - H2*60;
        System.out.println(H2+" "+M2);}


    }
}
