package ua.zp.brainacad;

import java.util.Objects;

public class Employee extends Human {
    private String dateOfStartWork;
    private double salary;
    private boolean isPresence;

    public Employee(String name, String date, String phone) {
        super(name, date, phone);
    }

    public void comeWork() {
        isPresence = true;
    }

    public void goLunch() {
        isPresence = false;
    }

    public void doWork() {
        System.out.println("Employee do the work.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                isPresence == employee.isPresence &&
                Objects.equals(dateOfStartWork, employee.dateOfStartWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfStartWork, salary, isPresence);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dateOfStartWork='" + dateOfStartWork + '\'' +
                ", salary=" + salary +
                ", isPresence=" + isPresence +
                '}';
    }
}
