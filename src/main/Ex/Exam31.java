class Pet_2{
    private String type;
    private int age;
    static int count = 0; //애완동물 수

    Pet_2(String type, int age) {
        this.type = type;
        this.age = age;
    }
    static int getCount(){
        return count;
    }
    public void move(){
        System.out.println(this.type + " 가 움직입니다.");
    }

    public String getType() {
        return this.type;
    }
    public int getAge(){
        return this.age;
    }
}
public class Exam31 {
    public static void main(String[] args) {
        Pet_2 pet1 = new Pet_2("강아지", 9);
        Pet_2.count++;//클래스속성

        Pet_2 pet2 = new Pet_2("고양이", 13);
        Pet_2.count++;

        pet1.move();
        pet2.move();

        System.out.println(pet1.getType()+" 는 "+ pet1.getAge()+" 살 입니다.");
        System.out.println(pet2.getType()+" 는 "+ pet2.getAge()+" 살 입니다.");

        System.out.println("현재 우리집의 동물 수는 "+Pet_2.getCount()+" 마리 입니다.");
    }
}
