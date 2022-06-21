class Car_b {
    Car_b() {
        System.out.println("슈퍼클래스 생성자 호출(파라미터 없음)");
    }
    Car_b(String str) {
        System.out.println("슈퍼 클래스 생성자 호출 ==>"+str);
    }
}

class Sedan_b extends Car_b {
    //생성자의 순서 영향받는다.
    Sedan_b(){
        //슈퍼클래스메소드생성자
        super("super() 메소드");
        System.out.println("noParam");
    }
    Sedan_b(String str) {
        super();
        System.out.println("서브 클래스 생성자 호출 ==>"+str);

    }
}

public class Ex_12_03 {

    public static void main(String[] args) {

        Sedan_b sedan_1 = new Sedan_b("생성자 문자열 파라미터");
        System.out.println("-------- ");
        Sedan_b sedan_2 = new Sedan_b();
        System.out.println("ㄴ 파라미터 없는 서브클래스의 생성자");
        System.out.println("-------- ");

        Car_b super_1 = new Car_b("슈퍼클래스 생성자 : 파라미터");

    }
}
