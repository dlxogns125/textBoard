package pratice;

import java.util.Scanner;

public class course08 {
    // 메인함수
    public static void main(String[] args) {
        // 호출
        // 함수이름();
        // 재사용성, 중복코드 제거, 관리가 용이

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("안녕하세요.");

        loop(20);
        greet("hi");

        loop(100);
        greet("hello");

        test();
        check(0);
        divide(6,4);
        divide(6,0);
        System.out.println(printBigNumber(6,3));

        // int a = calculator();
        System.out.println(calculator());

        // 숫자를 두개 받아 나누는 함수를 만들어주세요
        // void 타입
        // 나누는 수가 0이면 "나누는 수는 0일수가 없습니다."라고 출력하고
        // 함수를 종료해주세요.
        // 조건문이 falsle가 되어 실행되지 않으면
        // 두 수를 나눠주시면 됩니다.


    }
    // 메서드
    // 정의
    // static 리턴타입 함수이름 (){}

    public static void loop(int x){
        for(int i=0; i <= 10; i++){
            System.out.println(i);
        }
    }
    public static void greet(String str){
        System.out.println(str);
    }
    // 매개변수
    //  return : 함수 종료, 값 반환

    public static void test(){
        System.out.println("return1");
        return;
        // System.out.println("return2");
    }

    public static void check(int num){
        if(num == 0){
            System.out.println(num + "을 입력하셨습니다. 함수가 종료됩니다.");
            return;
        }
    }


    public static void divide(int x, int y){
        if(y == 0){
            System.out.println("나누는 수는 0이 될 수 없습니다.");
            return;
        }
        int result = x / y;
        System.out.println(x + "/"+ y + " = " + result);
    }

    public static int printBigNumber(int a, int b){

        int big = a;

        if(big < b){
            big = b;
        }
        return big;
    }
    // +,-,*,/ 메소드를 만들어주세요
    // return a+b;
    // calculator()
    // return int;
    // 매개변수는 없다.
    // 사용자로부터 숫자 두개를 받아줍니다.
    // "첫번째 숫자 : " 5
    // "두번째 숫자 : " 10
    // " 사칙연산연산자를 넣어주세요 : " +
    // switch case문 사용
    // default : " 지원하지 않는 연산자입니다."
    // sout(calculator());
    // 연산은 위에서 만든 사칙연산 메소드를 사용해 연산합니다.

    public static int plus(int x, int y){
        return x + y;
    }
    public static int minus(int x, int y){
        return  x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static int divide1(int x, int y){
        return x / y;
    }
    public static int calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요 : ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("사칙연산 연산자를 입력해주세요 : ");
        String operator = scanner.nextLine();

        int result = 0;
        switch (operator){
            case "+" :
                plus(num1, num2);
                break;
            case "-":
                result= minus(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide1(num1, num2);
                break;
            default:
                System.out.println("지원하지 않는 연산자입니다.");
                break;
        }
        return  result;
    }

    // main
    // 첫번째 숫자 : 5
    // 두번째 숫자 : 10
    //  " 사칙연산연산자를 넣어주세요 : " +
    // method
    // calculator(5,10 "+" )





}
