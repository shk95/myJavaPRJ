class Pet_1 {
    private String type;
    private int age;

    public void move() {
        System.out.println(this.type + " 가 움직입니다.");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return age;
    }
}

public class Exam30 {
    public static void main(String[] args) {
        Pet_1 pet1 = new Pet_1();
        pet1.setType("강아지");
        pet1.setAge(8);

        Pet_1 pet2 = new Pet_1();
        pet2.setType("고양이");
        pet2.setAge(14);

        pet1.move();
        pet2.move();

        System.out.println(pet1.getType() + " 는 " + pet1.getAge() + " 살 입니다.");
        System.out.println(pet2.getType() + " 는 " + pet2.getAge() + " 살 입니다.");
    }
}
