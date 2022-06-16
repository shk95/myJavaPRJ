class Car_2 {
    private String color;
    private int speed;

    //생성자 함수에 파라미터 설정
    Car_2(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getColor() {
        return this.color;
    }
}

public class Ex_11_07 {
    public static void main(String[] args) {
        Car_2 myCar1 = new Car_2("빨강", 10);
        Car_2 myCar2 = new Car_2("파랑", 100);

        System.out.printf("자동차 1 의 색깔 은 %s 이고 속도는 %d 이다.", myCar1.getColor(), myCar1.getSpeed());
        System.out.println();
        System.out.printf("자동차 2 의 색깔 은 %s 이고 속도는 %d 이다.", myCar2.getColor(), myCar2.getSpeed());

    }
}
