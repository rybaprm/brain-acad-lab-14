package ua.zp.brainacad;

import java.util.Objects;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String date, String phone) {
        super(name, date, phone);
    }

    public void consult() {
        System.out.println("Manager consult the client.");
    }

    public void tellAboutDiscounts() {
        System.out.println("Manager tell the client about discounts.");
    }

    public void giveAdvice() {
        System.out.println("Manager giv advance to the client.");
    }

    @Override
    public void comeWork() {
        super.comeWork();
        System.out.println("Manager come to work.");
    }
    @Override
    public void goLunch() {
        super.goLunch();
        System.out.println("Manager go to lunch.");
    }

    @Override
    public void doWork() {
        System.out.println("Manager do the work.");
        consult();
        tellAboutDiscounts();
        giveAdvice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}
