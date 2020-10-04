package ua.zp.brainacad;

import java.util.Objects;

public class Client extends Human {
    private int discountId;
    private double valueOfMoney;

    public Client(String name, String date, String phone) {
        super(name, date, phone);
    }
    public void learnProduct(){
        System.out.println("Client learn about the product.");
    }
    public void byeProduct(){
        System.out.println("Client bye the product.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return discountId == client.discountId &&
                Double.compare(client.valueOfMoney, valueOfMoney) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discountId, valueOfMoney);
    }

    @Override
    public String toString() {
        return "Client{" +
                "discountId=" + discountId +
                ", valueOfMoney=" + valueOfMoney +
                '}';
    }
}
