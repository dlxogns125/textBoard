public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String nam,int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println("이름 : " + name + "나이 : " + age + " 성별 : " + gender);
    }
}
