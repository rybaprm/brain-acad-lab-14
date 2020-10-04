package ua.zp.brainacad;

import java.util.Objects;

public class Human {
    private String name;
    private String date;
    private String phone;

    public Human(String name, String date, String phone) {
        this.name = name;
        this.date = date;
        this.phone = phone;
    }

    public void seyHello() {
        System.out.println("Hello.");
    }

    public void seyGoodbye() {
        System.out.println("Goodbye.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(date, human.date) &&
                Objects.equals(phone, human.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, phone);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
