public class Valiable {

    // 지역변수
    // 함수 내부에서 선언한 변수는 함수 내부에서만 사용해야한다
    // 외부에서 접근 불가

    // 전역변수
    // 함수 외부에서 선언한 변수는 함수 내부나 외부 모두 사용가능하다.

    public Valiable(){

    }

    String a = "이건 전역변수야";

    public String test(){
        String b = "이건 지역변수야";

        String a = b;

        return a;
    }
    public String test2(){
        return a;
    }

   // String test3 = b; 지역변수는 함수 밖에서 사용이 안된다.
    String test4 = a;

    String c = "hello";

    public void test5(){
        String c = "100";
        System.out.println("함수 내부에서 print : "+ c);
    }






}
