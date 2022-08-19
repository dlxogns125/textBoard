import java.util.Scanner;

public class Student1 extends Person{

    private String school;
    private String grade;

    public Student1(String name, int age, String gender, String school, String grade) {
        super(name, age, gender);
        this.school = school;
        this.grade = grade;
    }

    public void score(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("국어, 수학, 영어점수를 입력해주세요 : ");
        int kor = scanner.nextInt();
        int math = scanner.nextInt();
        int english = scanner.nextInt();

        int sum = kor + math + english;
        int avg = sum / 3;

        System.out.println("총합은 : " + sum);
        System.out.println("평균은 : " + avg);

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("학교는 : " + school + "학년 : " + grade);
    }

    // 오버라이드
    // - 메소드의 내용을 재정의 하는 것이기 때문에 메소드의 이름은 동일하되 본문이 달라져야한다.

    // 오버로드
    // - 메소드의 이름만 같고 매개변수가 달라야한다.

}
