package pratice;

import java.util.Scanner;

public class cousre04 {
    public static void main(String[] args) {

        //for
        /*
        for(초기화; 조건; 증가/감소){
        }
        while(조건){
        }
         */
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        // 1 ~ 10 까지의 합
        int sum = 0;
        for(int a = 1; a <= 10; a++ ){
            sum += a;
        }
        System.out.println(sum);

        int n = 1;
        while(n <= 10){
            System.out.println(n);
            n++;
        }
        // 1 ~ 100 까지 수 중 짝수만 출력해주세요.
        for(int n1 = 1; n1 <= 100; n1++){
            if(n1 % 2 == 0){
                System.out.println(n1);
            }
        }
        // 구구단을 입력받아 해당 단만 출력해보기
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        for(int b = 1; b<=9; b++){
            System.out.println(dan + "X" + b + "=" + dan * 3);
        }

        // 중첩 for문
        for(int d = 1; dan <= 9; d++) {
            System.out.println(d+ "단");
            for(int f = 1; f <= 9; f++){
                System.out.println(d + "x" + f + "=" + d*f);
                break;
            }
        }
        // 중첩 for문을 사용해
        // ****
        // ****
        // ****

        for(int c = 1; c <=3; c++){ // 3줄
            for(int e = 1; e <= 4; e++){ //4번 별을 출력하기 위한 반복
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
