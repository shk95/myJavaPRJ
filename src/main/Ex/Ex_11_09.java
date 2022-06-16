class Calc {
    //    double 형 데이터 의 더한값 반환
    void addValue(double a, double b) {
        System.out.println("double 의 더한 값 ==> "+(a+b));
    }

    void addValue(int a, int b) {
        System.out.println("int 의 더한 값 ==> "+(a+b));
    }
    void addValue(short a, short b) {
        System.out.println("int 의 더한 값 ==> "+(a+b));
    }
    void addValue(float a, float b) {
        System.out.println("float 의 더한 값 ==> "+(a+b));
    }
    void addValue(String a, String b) {
        System.out.println("String 의 더한 값 ==> "+a+b);
    }
}
public class Ex_11_09 {
    public static void main(String[] args) {
        Calc f = new Calc();

        f.addValue(1.2,1.3) ;
        f.addValue(1,13) ;
        f.addValue(5f,13f) ;
        f.addValue("가나다","abc") ;
    }
}
