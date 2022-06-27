interface Car_13{
   void work();//abstract 생략
}

interface Cannon_13{
    void fire();
}

interface MachineGun{
    void shoot();
}

class Tank implements Car_13,Cannon_13,MachineGun{
    public void work(){
        System.out.println("탱크가 앞으로 굴러갑니다.");
    }
    public void fire(){
        System.out.println("탱크에서 대포를 발사합니다.");
    }
    public void shoot(){
        System.out.println("탱크에서 총을 쏩니다.");
    }
}

public class Ex_12_11 {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        tank1.work();
        tank1.fire();
        tank1.shoot();
    }
}
