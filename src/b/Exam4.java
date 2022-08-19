package b;

import a.Exam1;

public class Exam4 extends Exam1 {
    public Exam4(){
        super(); // 생성자 접근 가능
        super.exam = "필드"; // 필드 접근 가능
        super.examMethod(); // 메소드 접근 가능
    }
}
