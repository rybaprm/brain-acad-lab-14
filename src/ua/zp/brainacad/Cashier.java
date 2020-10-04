package ua.zp.brainacad;

import java.util.Objects;

public class Cashier extends Employee {
    private int numberOfСashbox;

    public Cashier(String name, String date, String phone) {
        super(name, date, phone);
    }

    public void countMoney(){
        System.out.println("Cashier count the money.");
    }
    @Override
    public void comeWork() {
        super.comeWork();
        System.out.println("Cashier come to work.");
    }

    @Override
    public void goLunch() {
        super.goLunch();
        System.out.println("Employee go to lunch.");
    }

    @Override
    public void doWork() {
        System.out.println("Cashier do the work.");
        countMoney();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cashier)) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return numberOfСashbox == cashier.numberOfСashbox;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfСashbox);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "numberOfСashbox=" + numberOfСashbox +
                '}';
    }
}
