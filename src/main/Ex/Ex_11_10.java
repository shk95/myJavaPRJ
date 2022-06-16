class Car_4 {
    String color;
    int speed;
    int count_1 = 0;
    static int count_2 = 0;

    Car_4() {
        count_1++;
        count_2++;
    }

}

public class Ex_11_10 {
    public static void main(String[] args) {
        Car_4 myCar1 = new Car_4();
        System.out.println("현재 생산된 자동차 숫자(인스턴스 변수) ==> " + myCar1.count_1+"현재 생산된 자동차 숫자(클래스 변수) ==> "+myCar1.count_2);
        Car_4 myCar2 = new Car_4();
        System.out.println("현재 생산된 자동차 숫자(인스턴스 변수) ==> " + myCar2.count_1+"현재 생산된 자동차 숫자(클래스 변수) ==> "+myCar2.count_2);
        Car_4 myCar3 = new Car_4();
        System.out.println("현재 생산된 자동차 숫자(인스턴스 변수) ==> " + myCar3.count_1+"현재 생산된 자동차 숫자(클래스 변수) ==> "+Car_4.count_2);
    }
}
