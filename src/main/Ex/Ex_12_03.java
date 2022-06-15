class Car_b {
    Car_b() {
        System.out.println("슈퍼클래스 생성자 호출(파라미터 없음)");
    }
    Car_b(String str) {
        System.out.println("슈퍼 클래스 생성자 호출 ==>"+str);
    }
}

class Sedan_b extends Car_b {
    Sedan_b(String str) {
        System.out.println("서브 클래스 생성자 호출 ==>"+str);
    }
}

public class Ex_12_03 {

    public static void main(String[] args) {
        Sedan_b sedan_1 = new Sedan_b("생성자 문자열 파라미터");

    }
}
