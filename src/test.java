
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        // 숫자를 입력받아 입력받은 수가 짝수면 true, 홀수면  false 출력해주세요.
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int a = scanner.nextInt();
        boolean result = a % 2 == 0 ? true : false;
        System.out.println(result);

//        String b = scanner.nextLine();
//        int intB = Integer.parseInt(b);
//        boolean result2 = a % 2 == 0 ? true : false;
//        System.out.println(result2);

    }
}
