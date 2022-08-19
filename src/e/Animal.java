package e;

public abstract class Animal {

    public String name;

    public Animal(String name){
        this.name= name;
    }

    // 추상 메소드 : 추상클래스를 상속받은 자식클래스에서 반드시 구현해야하는 메소드
    public abstract void eat();
    public abstract void sleep();
    public abstract void drink();

    // 일반 메소드

    public void run(int speed){}
    public void hide(String place){}

}
