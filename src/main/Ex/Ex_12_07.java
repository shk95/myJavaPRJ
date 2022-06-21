class Car_9{
   int speed = 0;

    final void upSpeed(int speed) {
        this.speed += speed;
    }
}

class Sedan_9 extends Car_9 {
    final static String CAR_TYPE = "승용차";

    /*void upSpeed(int speed) {
        재정의시 오류발생
    }*/
}
public class Ex_12_07 {
    public static void main(String[] args) {
        System.out.println("Sedan 클래스 타입 ==> "+ Sedan_9.CAR_TYPE);
    }
}
