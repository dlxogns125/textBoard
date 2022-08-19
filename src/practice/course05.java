package pratice;

public class course05 {
    public static void main(String[] args) {
        /*
        while/ for
        - 제어
        - break
        - continue
         */
       // int n = 1;
        /*
        변수를 불린타입으로 만들어 true를 주고,
        정수타입의 변수를 하나 만들어 0을 대입합니다.
        while(불린변수){
            if(정수 변수 == 5){
            false
            }
        }
        // 정수변수의 값을 1 증가 시켜줍니다.

        boolean state = true;
        int n = 0;

        while(state){
            System.out.println(n);
            if(n == 5){
               // state = false;
                break;
            }
            n++;
        }
        */
       // for
        // 1 ~ 10까지 반복되는데 5가 되면 break 사용하여 반복을 멈춰주세요.
       for(int a = 1; a <= 10; a++){
           if (a == 5){
               break;
           }
           System.out.println(a);
       }
        // 1 ~ 10까지의 수를 더하는데 그 합이 10이 넘어가면 멈추게 만들어주세요.
        int sum = 0;
        for (int n1 = 1; n1 <= 10; n1++){

            if (sum > 10) {
                break;
            }
            sum += n1;
            System.out.println("숫자 : " + n1);
            System.out.println("합 : " + sum);
        }
       // continue
        // 1~10 까지 반복중
        int n = 0;
        while(n <= 10) {
           n++;
            if(n == 5){
                continue;
            }
            System.out.println(n);
        }
        // 1~10부터 수를 더하는데 홀수일때는 더하고 짝수일때는 더하지 않는 프로그램을 만드세요\
        int sum1 = 0;
        for (int n2 = 1; n2 <= 10; n2++){
            if(n2 % 2 == 0){
                continue;
            }
            sum1 += n2;
                }
        System.out.println("합은 : " + sum1);

        // 구구단 중 홀수의 단만 출력하도록 만들어 주세요.


    }
}