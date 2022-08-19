package e;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    public void printInfo(){
        System.out.println("이름은 " + name + "입니다.");
    }


    @Override
    public void eat() {
        System.out.println("사료를 먹습니다");
    }

    @Override
    public void sleep() {
        System.out.println("개집에서 잡니다.");
    }

    @Override
    public void drink() {
        System.out.println("물을 마십니다.");
    }

    @Override
    public void run(int speed) {
        System.out.println(speed + "속도로 달립니다.");
    }
}
