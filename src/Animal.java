public class Animal {

    private String name;
    private String color;
    private int age;
    private String gender;

    // get() / set()
    public void setName(String animalName){

        name = animalName;
    }
    public String getName()
    {
        return name;
    }
    public  void setColor(String animalColor){

        color = animalColor;
    }
    public void setAge(int animal_age){

        age = animal_age;
    }
    public void setGender(String animalGender){

        gender = animalGender;
    }

    public void walk (){
        System.out.println("걷는다");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
