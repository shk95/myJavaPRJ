abstract class Car_11 {
    int speed = 0;
    String color;

    void upSpeed(int speed) {
        this.speed +=speed;
    }

    abstract void work();
}

class Sedan_11 extends Car_11{
    void work() {
        color = "빨강";
        System.out.println(color+" 승용차가 사람을 태우고 있습니다");
        upSpeed(200);
        System.out.println("속도 올림 : "+speed);


    }
}
class Truck_11 extends Car_11{
    void work() {
        color = "파랑";
        System.out.println(color+" 트럭이 짐을 싣고 있습니다");
        upSpeed(300);
        System.out.println("속도 올림 : "+speed);


    }
}
public class Ex_12_09 {
    public static void main(String[] args) {

        Sedan_11 sedan1 = new Sedan_11();
        sedan1.work();
        Truck_11 truck1 = new Truck_11();
        truck1.work();
    }
}
