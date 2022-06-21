class Car_7{
   protected String color;
   int speed;
}
class Sedan_7 extends Car_7{
    void setSpeed(int speed){
        this.speed = speed;
    }

    void setColor(String color) {
        this.color = color;
    }
}
public class Ex_12_05 {
    public static void main(String[] args) {
        Sedan_7 sedan1 = new Sedan_7();

        sedan1.setSpeed(100);

        sedan1.setColor("빨강");
        System.out.println("속도 : "+sedan1.speed);
        System.out.println("색깔 : "+sedan1.color);
    }
}
