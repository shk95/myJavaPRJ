class Car_3 {
    private String color;
    private int speed;

    Car_3() {
    }

    Car_3(String color) {
        this.color = color;
    }

    Car_3(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    void setSpeed(int speed) {
        if (speed > 200) {
            System.out.println("속도제한 200");
            this.speed = 200;
        }else {
            this.speed = speed;
        }
    }

    public String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }
}

public class Ex_11_08 {
    public static void main(String[] args) {
        Car_3 myCar1 = new Car_3();
        Car_3 myCar2 = new Car_3("파랑");
        Car_3 myCar3 = new Car_3("빨강",250);

        System.out.printf("자동차 1 의 색상은 %s 이고 속도는 %d 입니다.",myCar1.getColor(),myCar1.getSpeed());
        System.out.println();
        System.out.printf("자동차 1 의 색상은 %s 이고 속도는 %d 입니다.",myCar2.getColor(),myCar2.getSpeed());
        System.out.println();
        System.out.printf("자동차 1 의 색상은 %s 이고 속도는 %d 입니다.",myCar3.getColor(),myCar3.getSpeed());

    }
}
