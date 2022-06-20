class Car_5 {
    String color;
    int speed;
    private static int count = 0;

    Car_5() {
        count = 10;
    }

    static int getCount() {
        return count;
    }
    int instanceGetCount(){
        return 1;
    }

}

public class Ex_11_11 {
    public static void main(String[] args) {
        System.out.println("현재 생산된 자동차 숫자 ==> " + Car_5.getCount());

        Car_5 myCar1 = new Car_5();
        System.out.println("현재 생산된 자동차 숫자 ==> " + myCar1.getCount());

        System.out.println("현재 생산된 자동차 숫자 ==> " + Car_5.getCount());
    }
}
