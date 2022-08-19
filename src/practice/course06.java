package pratice;

import java.util.Random;
import java.util.Scanner;

public class course06 {
    public static void main(String[] args) {
        /*
        while () {
        }
    }
        do{
            실행문
        }while(조건);
         */

        int n = 1;

        while (n>=10){
            System.out.println("while : " + n);
            n++;
        }

        n = 1;

        do{
            System.out.println("do : " + n);
            n++;
        }while(n > 11);

        // 숫자
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("숫자를 입력해주세요 :");
            number = scanner.nextInt();

        }while(number != 0);

        System.out.println("반복문 종료");

        //문자
        // o, x
        // String
        // 반복을 종료하시겠습니까 : 0
        // 반복문 종료
        // ==equals()

        String a;

        do{
            System.out.println("x, o : ");
            a = scanner.nextLine();
        }while(a.equals("o"));

        System.out.println("반복문 종료");

        // random
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);

        int i = 1;
        while(i < 11){
            int x = random.nextInt(10);
            System.out.println(x);
            i++;
        }

        // do -while
        // 0 ~ 10까지의 난수를 두개 만들어 줍니다.
        // 두 난수를 더해 변수에 담아줍니다.(합)
        // 7 + 5 =
        // 예상하는 합의 결과를 입력받습니다.
        // 7 + 5 = 12
        // 정답입니다.
        // 정답이 아닙니다.
        // 계속 하시겠습니까?(Y, N) :
        // N 입력하면 "게임 끝"이라고 출력 후 강제 종료

        Random random1 = new Random();
        Scanner scanner1 = new Scanner(System.in);

        do{
            int num1 = random1.nextInt(10);
            int num2 = random1.nextInt(10);
            int sum = num1 + num2;

            System.out.print(num1 + " + " + num2 + " = ");

            int result = scanner1.nextInt();

            if(sum == result){
                System.out.println("정답입니다.");
            }else{
                System.out.println("정답이 아닙니다.");
            }

            System.out.println("계속 하시겠습니까? (Y, N) : ");
            String x = scanner1.next();

            if (x.equals("N")) {
                System.out.println("게임 끝");
                break;
            }

        }while(true);

        // 돈을 넣어주세요 : 1500
        // money <=0
        // 돈이 부족합니다.
        // 불린타입의 변수를  fasle로 바꿔 반복 멈추기

        // money -= 500
        // 불린타입으로 변수를 만들어 true
        Random random2 = new Random();
        Scanner scanner2 = new Scanner(System.in);

        boolean state = true;
        System.out.println("돈을 넣어주세요 : ");
        int money = scanner2.nextInt();

        /*do{

            if(money<=0)
                System.out.println("돈이부족합니다.");
            state = false;


        }
        //
         */



    }

}
