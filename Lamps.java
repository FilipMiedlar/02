public class Lamps {
    boolean lampStatus = false;

    public void lampSwitchOn() {

        lampStatus = true;
        System.out.println("The lamp is now on.");

    }

    public void lampSwitchOff() {

        lampStatus = false;
        System.out.println("The lamp is now off.");

    }

    public static void main(String[] args) {
        Lamps lamp1 = new Lamps();
        Lamps lamp2 = new Lamps();
        lamp1.lampSwitchOn();
        lamp2.lampSwitchOn();
        lamp2.lampSwitchOff();
    }

}
