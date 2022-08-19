package g;

public class Aircon implements ONoOff {
    public String id;
    public double temp = 26.0;

    public Aircon(String id) {
        this.id = id;
    }
    @Override
    public boolean on(){
        System.out.println(id + " 에어컨이 " + temp + "도로 켜졌습니다.");
        return true;
    }
    public boolean on(double changeTemp){
        this.temp = changeTemp;
        on();
        return false;
    }
    @Override
    public boolean off() {
        System.out.println(id + " 에어컨이 꺼졌습니다.");
        return false;
    }
}

