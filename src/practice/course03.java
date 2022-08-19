package pratice;

import java.util.Scanner;

public class course03 {
    public static void main(String[] args) {

        // 반복문
        // while / for
        // 1부터 10까지의 합
        /*
        int a = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        int num = 1;
        num += 2; // num = num+2;
        num += 3;
        num += 4;
        num += 5;
        num += 6;
        num += 7;
        num += 8;
        num += 9;
        num += 10;

        System.out.println("1부터 10까지의 합은 " + num + "입니다.");
        /*
        while(조건식){
            수행문
        }
         */
        while (true) {
            System.out.println("hi");
            break;
        }
        /*
        int n = 1;
        int sum = 0;
        while (n <= 10) {
            System.out.println(n);
            sum += n;
            n++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다");

        // 1. while문을 사용해 1부터 10까지 출력해주세요.
        int n1 = 1;
        while (n1<=10){
            System.out.println(n1);
            n1++;
        }
        // 2. 1부터 100까지 숫자 중 짝수만 출력해주세요.
        int n2 = 1;
        while (n2 <= 100) {
            if (n2 % 2 == 0) {
                System.out.println(n2);
                n2++;
            }
        }
        */
        // 중첩 while
        /*
        while(){

           while(){

           }
        }
         */
        // 구구단 2x1 = 2.
        int dan = 2;
        while (dan <= 9) { //2 반복
            int n3 = 1;
            while(n3 <= 9){ // 1~9 반복
                n3+=1;
                System.out.println(dan + "x"+n3 + "="+dan *n3);
            }
            dan +=1;
            System.out.println();
        }
        // 단을 입력받아 입력받은 구구단을 출력해주세요.
        int dan1 = 2;

        /*
        커피 1잔을 300원에 판매하는 커피자판기가 있습니다. 이 커피자판기에 돈을 넣으면 자판기에서 뽑을 수 있는 커피가
        몇 잔이며, 잔돈은 얼마인지 함께 출력하는 프로그램을 구현하세요.
        >자판기에 얼마나 넣을까요? : 1500
        >커피 1잔, 잔돈 1200원
        >커피 2잔, 잔돈 900원
        >커피 3잔, 잔돈 600원
        >커피 4잔, 잔돈 300원
        >커피 5잔, 잔돈 0원
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("자판기에 얼마나 넣을까요? : ");
        int money = scanner.nextInt();
        int n = 0;
        while (money >= 300) {
            n += 1;
            money -= 300;
            System.out.println("커피" + n + "잔, 잔돈 " + money + "원");
        }

    }
}
