package e;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("강아지");

        dog.eat();
        dog.sleep();
        dog.drink();
        dog.run(15);
        dog.printInfo();
    }
}
