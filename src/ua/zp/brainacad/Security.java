package ua.zp.brainacad;

public class Security extends Employee {

    public Security(String name, String date, String phone) {
        super(name, date, phone);
    }

    public void talkRadio() {
        System.out.println("Security talk on the radio");
    }

    @Override
    public void comeWork() {
        super.comeWork();
        System.out.println("Security come to work.");
    }

    @Override
    public void goLunch() {
        super.goLunch();
        System.out.println("Security go to lunch.");
    }

    @Override
    public void doWork() {
        System.out.println("Security do the work.");
        talkRadio();
    }

    @Override
    public String toString() {
        return "Security{}";
    }
}
