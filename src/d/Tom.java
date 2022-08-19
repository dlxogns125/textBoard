package d;

public class Tom extends Human {

    @Override
    public int add(int a, int b) {
        return 0;
    }
    // 추상메소드를 모두 구현한다.
    // 자식 클래스를 추상클래스로 만든다.
    @Override
    public void walk(){
        System.out.println("Tom이 걷습니다.");
    }
}
