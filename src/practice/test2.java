package pratice;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        // 문제
        // 월을 입력받아 해당월이 31까지라면 "31일입니다"
        // 30일까지라면 "30일입니다"
        // 28일까지라면 "28일입니다."
        // 그 외의 입력은 "잘못된 입력입니다." 를 출력해주세요.

        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력해 주세요 :");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "월은 31일까지 입니다.");
                break;
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 30일까지 입니다.");
                break;
            case 2:
                System.out.println(month + "월은 29일까지 입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

    }
}