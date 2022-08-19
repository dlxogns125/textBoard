import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        /*
        scanner 를 사용해 배열의 크기를 입력받고

        크기만큼 요소를 입력받아 배열을 완성해 주세요.
        배열의 크기를 정해주세요 : 5
        1번째 숫자를 입력해 주세요 : 5
        1번째 숫자를 입력해 주세요 : 2
        1번째 숫자를 입력해 주세요 : 4
        1번째 숫자를 입력해 주세요 : 7
        1번째 숫자를 입력해 주세요 : 0
        5 2 4 7 0

        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 크기를 정해주세요: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print((i+1) + "번째 숫자를 입력해 주세요 : ");
            int num = scanner.nextInt();
            arr[i] = num;
        }

        for(int a : arr){
            System.out.println(a);
        }
        /*
        2.
        배열의 길이가 100인 배열을 만들어 1부터 100까지를 넣어줍니다.
        그 중 짝수만 출력하도록 만들어주세요.

        2
        4
        6
        8
        10
        12
...
        98

         */

        int num = 1;
        int[] hundred = new int[100];
        for(int i = 0; i < hundred.length; i++, num++){
            hundred[i] = num;
            if(hundred[i] % 2 == 0){
                System.out.println(hundred[i]);
            }
        }
        /*3.
        아스키코드 찾기
        //26칸 짜리 배열을 하나 만들어 반복문을 사용해
        A부터 Z까지를 담아줍니다.
                그리고 알파벳이 아스키코드에 몇번에 해당하는지 출력해주세요

        A : 65
        B : 66
        C : 67
        Z : 90
         */

        char[] alphabet = new char[26];
        char start = 'A';

        for(int i = 0; i < alphabet.length; i++, start++){
            alphabet[i] = start;
        }

        for(char one : alphabet){
            System.out.println(one + " : " + (int)one);
        }
    }
}
