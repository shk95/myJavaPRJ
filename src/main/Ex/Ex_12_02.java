class Car_a {
    Car_a(){
        System.out.println("Car 생성자 호출");
    }
}

class Sedan_a extends Car_a {
    Sedan_a() {
        System.out.println("Sedan 생성자 호출");
    }
}

public class Ex_12_02 {
    public static void main(String[] args) {
        Sedan_a sedan1 = new Sedan_a();
    }
}
