package c;

public class TestMain {

    public static void main(String[] args) {

        Test4 test4 = new Test4();

        Test4 test1 = new Test4(100);
        Test4 test2 = new Test4("문자");
        Test4 test3 = new Test4(1,"문자");

        test4.plus();
        test4.plus(10,5);
        test4.plus(1,2,3);

        Test3 test31 = new Test3();
        test31.override();

    }
}
