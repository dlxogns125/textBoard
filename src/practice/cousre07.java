package pratice;

import java.util.Scanner;

public class cousre07 {
    public static void main(String[] args) {

        /* 배열(array)
        int a = 1;
        자료형[] 배열이름;

        자료형 [] 배열이름 = new 자료형[배열의 크기];
        자료형 배열이름[] = new 자료형[배열의 크기];
        */

        int[] number;
        number = new int[]{1, 2, 3, 4, 5};

        // 배열이름[인덱스]
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);

        int[] a = {1, 2, 3, 4, 5,};

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 10;
        arr[4] = 15;

        System.out.println(arr[4]);

        arr[4] = 100;

        System.out.println(arr[4]);

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }

        // 인덱스

        // 총 5명의 학생이 시험을 봤는데 시험점수가 60점이 넘으면 합격이고, 그렇지 않으면 불합격입니다.
        // 합격인지 불합격인지 결과를 보여주세요.

        int[] scores = {30, 75, 80, 100, 50};

        for (int i = 0; i <= 5; i++) {
            System.out.println(scores[i]);

            if (scores[i] >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("불합격입니다.");
            }

            for (int score : scores) {
                System.out.println(score);
                if(score>= 60){
                    System.out.println("합격");
                }else{
                    System.out.println("불합격");
                }
            }
        }
        // 평균 구하기
        // length 사용
        int[] test = {65, 90, 70, 85, 100, 95, 75, 80, 60, 55};

        int sum = 0;
        for (int i = 0; i < test.length; i++) {
            sum += test[i];

            int avg = sum / test.length;
            System.out.println("합 : " + sum);
            System.out.println("평균 : " + avg);

        /*
        for(변수 : 배열){

        }
         */
        }


    }
}
