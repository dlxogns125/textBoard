public class Child extends Parent{

    public int age;

    public Child(String name, int age){
        super(name);
        this.age= age;
        System.out.println("자식클래스 생성자");
    }

    public void printChild(){
        System.out.println("자식클래스입니다.");
    }
}
