public class Main1 {
    public static void main(String[] args) {

        Child child = new Child("tom",30);
        child.printChild();
        child.printParent();


        // this
        // super

        Potato potato = new Potato("brown");
        System.out.println(potato.calorie);
        System.out.println(potato.color);

      // Student1 student1 = new Student1(tom,10,2학년)
    }

    public static class Root{
        public int calorie = 10;
    }

    public static class Potato extends Root{

        public String color;
        public Potato(String color){
            this.color = color;
            super.calorie = 250;
                }

            }

}