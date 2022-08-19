public class main {

    public static void main(String[] args) {

        // 정수
        int a = 10;
        // 실수
        double b = 5.6;
        // 문자
        char c = 'a';
        // 논리
        boolean d = true; // false
        // 문자열
        String e = "hello";

        Integer f = null;

        System.out.println(a);
        a = 100;
        System.out.println(a);

        // 상수
        // final 데이터타입 상수명 = 값;
        final int test = 55;
        // test =100;

        // 연산자
        // = : 대입연산자(같다x)
        // 산술연산자
        // +.-.*./, %
        // 우선순의 *,/,> +,

        System.out.println(3+5);
        System.out.println(3-5);
        System.out.println(3*5);
        System.out.println(3/5);
        System.out.println(3%5);

        int num1 = 23;
        int num2 = 3;
        int sum = num1+num2;
        System.out.println(sum);

        // korean = 80, math = 100, english = 75
        // sum 구하기
        // avg 구하기
        int korean = 80;
        int math = 100;
        int english = 75;
        int sum1 = korean + math + english;
        System.out.println(sum1);
        int avg = sum1 / 3;
        System.out.println("평균은 :" + avg);

        // 증가, 감소 연산자
        // ++ : 1을 더한다
        // -- : 1을 뺀다

        int score = 99;
        int lastscore = ++score;
        System.out.println(lastscore);

        int lastscore2 = --score;
        System.out.println(lastscore2);

        // 연산자의 위치
        int number = 5;
        int number2 = 0;


        number2 = ++number;
        System.out.println("number : " + number +  " number2 : " + number2);

        number = 5;
        number2 = 0;
        number2 = number++;
        System.out.println("number : " + number +  " number2 : " + number2);

        int a1 = 5;
        int b1 = 5;
        //a1++;
        System.out.println("a1++ : "+ a1++);
        //b1++;
        System.out.println("++b1 : " + ++b1);

        // 관계연산자
        // > : 크다
        // < : 작다
        // >= : 크거나 같다
        // <= : 작거나 같다
        // == : 같다
        // != : 아니다
        System.out.println(5 > 2);
        System.out.println(5 < 2);
        System.out.println(5 >= 2);
        System.out.println(5 <= 2);
        System.out.println(5 == 2);
        System.out.println(5 != 2);

        int age = 30;
        // System.out.println(age >  25);
        boolean result = age > 10;
        System.out.println("result : " + result);

        // 논리연산자
        // && : 두항이 모두 참인 경우에만 true를 반환
        // || : 두 항중 하나만 참이면 true를 반환, 두항 모두 거짓이면  false
        // !() : 참인 경우는 거짓으로, 거짓인 경우는 참으로 반환
        boolean result1 = 5 > 3 && 10 > 5 ; // 모두 참
        System.out.println(result1);
        boolean result2 = 5 > 3 || 10 < 5 ; // 하나는 참, 하나는 거짓
        System.out.println(result2);
        boolean result3 = !(5 > 3);
        System.out.println(result3);

        // 복합대입연산자
        // += : 오른쪽 항의 값을 더해 왼쪽변수에 대입
        // -= : 오른쪽 항의 값을 뺴 왼쪽변수에 대입
        // *= : 오른쪽 항의 값을 곱해 왼쪽변수에 대입
        // /= : 오른쪽 항의 값을 나눠 그 몫을 왼쪽변수에 대입
        // %= : 오른쪽 항의 값을 나눠 그 나머지를 왼쪽변수에 대입

        int numA = 10;
        numA += 2; // numA = numA + 2; => 12
        System.out.println(numA);
        numA -= 2; // numA = numA - 2; => 10
        System.out.println(numA);
        numA *= 2; // numA = numA * 2; => 20
        System.out.println(numA);
        numA /= 2; // numA = numA / 2; => 10
        System.out.println(numA);
        numA %= 2; // numA = numA % 2; => 10/2 = 5 나머지가 0
        System.out.println(numA);

        // 조건 연산자
        // 조건식 ()? 참 : 거짓;
        int last = (5 > 3)? 0 : 1;
        System.out.println(last);

        // 언니와 동생의 나이를 각각 변수로 만들어주세요
        // result 4 = 조건식이 참이면 'T' 거짓이면 'F'가 출력되도록 만들어주세요
        int age1 = 30;
        int age2 = 15;
        // 내가 푼방식
        // boolean result4 = (age1 > age2);
        // System.out.println(result4);

        char result4 = (age1 > age2)? 'T' : 'F';
        System.out.println(result4);


    }
}
