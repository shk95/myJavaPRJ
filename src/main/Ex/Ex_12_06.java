class Car_8{
    int speed;

    void upSpeed(int speed){
        this.speed = speed;
        System.out.println("현재속도(슈퍼클래스) : "+this.speed);
    }
}
class Sedan_8 extends Car_8{
    void upSpeed(int speed) {

        this.speed += speed;
        if (this.speed > 150) {
            this.speed = 150;
        }
        System.out.println("현재속도(서브클래스) : "+this.speed);
    }
}

class Truck_8 extends Car_8 {
}
public class Ex_12_06 {
    public static void main(String[] args) {

        Truck_8 truck1 = new Truck_8();
        Sedan_8 sedan1 = new Sedan_8();

        System.out.print("트럭 -> ");
        truck1.upSpeed(200);

        System.out.print("세단 -> ");
        sedan1.upSpeed(200);
    }
}
