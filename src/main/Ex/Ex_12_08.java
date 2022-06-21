abstract class Car_10 {
    int speed = 0;
    String color;

    void upSpeed(int speed) {
        this.speed += speed;
    }
}

class Sedan_10 extends Car_10 {
}

class Truck_10 extends Car_10 {
}

public class Ex_12_08 {
    public static void main(String[] args) {
        /*
        인스턴스 생성 불가 확인
        Car_10 a = new Car_10();
        */

        Sedan_10 sedan1 = new Sedan_10();
        System.out.println("승용차 인스턴스 생성");
        Truck_10 truck1 = new Truck_10();
        System.out.println("트럭 인스턴스 생성");

        System.out.println("==================");

        sedan1.upSpeed(200);
        truck1.upSpeed(400);
        System.out.println("승용차 속도 : "+sedan1.speed);
        System.out.println("트럭 속도 : "+truck1.speed);
    }
}
