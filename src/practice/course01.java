package pratice;

import java.util.Scanner;

public class course01 {

    public static void main(String[] args) {

        // 조건 연산자를 사용해 15가 짝수면 true 아니면 false 출력해주세요
        // 조건? 참 : 거짓
        int a1 = 15;
        boolean result = a1 % 2 == 0 ? true : false;
        System.out.println(result);

        // 변수 age를 만들어 19세 미만이면 " 미성년입니다" 이상이면 " 성인입니다" 출력해주세요
        int age = 19;
        String result2 = age > 19 ? "성인입니다." : "미성년입니다.";
        System.out.println(result2);

        // 스캐너
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        String number = scanner.nextLine();
        // String number = scanner.next();
        // int a = scanner.nextInt();
        System.out.println(number);
        // number = "10";
        int a = Integer.parseInt(number);
        System.out.println(a);

        // System.out.println(number);







    }

}
