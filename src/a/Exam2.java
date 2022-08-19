package a;

public class Exam2 {
    public void exam2Method(){
        Exam1 exam1 = new Exam1(); // 생성자 접근 가능
        exam1.exam = "필드"; // 필드 전근 가능
        exam1.examMethod(); // 메소드 접근 가능
    }

}
