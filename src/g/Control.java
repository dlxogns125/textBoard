package g;

import f.A;

public class Control {

    public static void main(String[] args) {

        String id = "동그라미 아파트 506호";
        Lighting lighting = new Lighting(id);
        Security security = new Security(id);
        Aircon aircon = new Aircon(id);
        Elevator elevator = new Elevator(id);

        security.getExistPeople();
        security.on();

        lighting.isOn();
        lighting.on();

        aircon.on();
        aircon.on(18.0);

        lighting.off();
        aircon.off();

        elevator.callForUp(5);

    }
}
