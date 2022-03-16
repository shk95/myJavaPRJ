public class Ex03_09 {

    public static void main(String[] args) {

        int a, b, c, d;



        a = 100 + 100;
        b = a + 100;
        c = a + b + -100;
        d=  a + b;
        d= d+c;



        System.out.printf("a,b,c,d 의 값 ==> %d, %d, %d, %d \n", a, b, c, d);


        a=b;
        b=c;
        c=d;
        a= 100;



        System.out.printf("a,b,c,d 의 값 ==> %d %d %d %d \n", a, b, c, d);


        a = 100;
        a = a + 200;
        System.out.printf("a 의 값 ==> %d \n", a);


    }
}
