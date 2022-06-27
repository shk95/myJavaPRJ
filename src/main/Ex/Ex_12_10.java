interface Car_12 {
    static final int CAR_COUNT = 0;

    abstract void work();

}

class Sedan_12 implements Car_12 {
    public void work() {
        System.out.println("승용차가 사람을 태우고 있습니다.");
    }

}

class Truck_12 implements Car_12 {
    public void work() {
        System.out.println("트럭이 짐을 싣고 있습니다1.");
    }
}

public class Ex_12_10 {
    public static void main(String[] args) {
        Sedan_12 sedan1 = new Sedan_12();
        sedan1.work();
        Truck_12 truck1 = new Truck_12();
        truck1.work();
        System.out.println(sedan1.CAR_COUNT);
        System.out.println(Car_12.CAR_COUNT);
    }
}
