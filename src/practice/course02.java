package pratice;

import java.util.Scanner;

public class course02 {
    public static void main(String[] args) {

        // 조건문
        // if (조건식){
        //     실행문
        // }

//        if (true) {
//            System.out.println("참");
//        }
//        if (false) {
//            System.out.println("거짓");
//        }
//        int score = 50;
//        if (score >= 80) {
//            System.out.println("합격입니다."); // 조건이 안맞으면 무시하고 다음 거로 넘어간다.
//        }
//        if (score >= 80) {
//            System.out.println(score + "점은 합격입니다.");
//        } else {
//            System.out.println(score + "점은 불합격입니다.");
//        }
//
//        // 문제
//        int age = 10;
//        if(age >= 20){
//            System.out.println("성인입니다.");
//        }else{
//            System.out.println("미성년자입니다.");
//        }

        System.out.println("정수를 입력해 주세요 : ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println("입력 받은 수 : " + n);

        if(n > 0){
            System.out.println(n + "는 양수입니다.");
        }else{
            System.out.println(n + "는 음수입니다.");
        }


        // else if(조건){
        //  수행문
        // }

        if(n > 0){
            System.out.println("양수입니다.");
        }else if(n == 0){
            System.out.println("0입니다.");
        }else{
            System.out.println("음수입니다.");
        }

        // man / woman
        // 입력받은 값이 man이면 "남성입니다."를 woman이면 "여성입니다."를
        // 둘다 아니면 "잘못된 입력입니다. man이나 woman을 입력해 주세요."

        System.out.print("성별을 입력해 주세요 : ");
        String gender = input.nextLine();

        if(gender.equals("man")){
            System.out.println("남성입니다.");
        }else if(gender.equals("woman")){
            System.out.println("여성입니다.");
        }else{
            System.out.println("잘못된 입력입니다. man 혹은 woman을 입력해 주세요");
        }

       // switch-case
              //  switch(조건){
               //     case 값: 수행문
                      //  break;
                  //  default:
                }

}
