class Car_6 {
    private String color;
    int speed;
}

class Sedan_c extends Car_6 {
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setColor(String color) {
       /* private color 는 상속되지 않음을 확인
        this.color = color;
       */
    }
}

public class Ex_12_04 {
    public static void main(String[] args) {
        Sedan_c sedan1 = new Sedan_c();

        sedan1.setSpeed(300);
//        speed 필드에 접근 가능
        System.out.println("승용차 속도 = " + sedan1.speed);
    }
}
