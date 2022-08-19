package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestA {
    public static void main(String[] args) {
     /*
     문제1

      */
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =  new ArrayList<>();

        System.out.println("0을 입력하면 종료됩니다.");

        while(true){

            System.out.print("숫자를 입력해주세요 : ");
            int num = scanner.nextInt();

            if(num==0) {
                System.out.println("종료합니다.");
                break;
            }else {
                numbers.add(num);
            }
        }
                        // [1,2,3,4,5,6,7]
        for(int number : numbers){
            System.out.println(number);
        }
        // 문제2.
        List<String> names = new ArrayList<>();

        for(int i = 1; i <=5; i++){
            System.out.println("이름을 입력해 주세요 : ");
            // String name = scanner.nextLine();
            // names.add(name);
            names.add(scanner.nextLine());
        }

        System.out.println("찾고자 하는 성을 입력해주세요. : ");
        String firstName = scanner.nextLine();

        boolean status = false;

        for (String name : names){
            // startsWith : 문자열이 인자로 넣은 문자로 시작하는지 아닌지를 판단해 t/f로 반환
            if(name.startsWith(firstName)){
                System.out.println(name);
                status = true;
            }
        }
        if (!status){
            System.out.println("찾으시는 성은 존재하지 않습니다.");
        }
    }
}
