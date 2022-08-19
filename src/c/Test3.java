package c;

public class Test3 extends Test2{

    //public void test2Method(){}

    //public void test2Method(){}

    // final 변수 : 값을 변경할수 없고, 반드시 초기화해 만들어줘야한다.
    public final int a = 10;

    @Override
    public void override(){
        super.override();
        System.out.println("test3 클래스 메소드");
    }
}
