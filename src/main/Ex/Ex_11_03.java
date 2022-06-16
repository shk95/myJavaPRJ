class Car_1 {
    private String color;
    private int speed;

    void setColor(String color) {
        this.color = color;
    }
    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getColor() {
        return this.color;
    }
    int getSpeed() {
        return this.speed;
    }


}
public class Ex_11_03 {
    public static void main(String[] args) {
        Car_1 myCar = new Car_1();
       myCar.setColor("빨강");
        myCar.setSpeed(0);

        System.out.println("현재 속도 : "+myCar.getSpeed());
        System.out.println("차량 색깔 : "+myCar.getColor());
    }
}
