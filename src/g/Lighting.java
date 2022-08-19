package g;

import java.util.Random;

public class Lighting implements ONoOff{
    public String id;

    public Lighting(String id){
        this.id=id;
    }
    @Override
    public boolean on(){
        System.out.println(id + "불이 켜졌습니다.");
        return true;
    }
    @Override
    public boolean off(){
        System.out.println(id + "불이 꺼졌습니다.");
        return false;
    }
    public boolean isOn(){
        Random random = new Random();
        boolean check = random.nextBoolean();
        System.out.println(check);
        return check;
    }
}
