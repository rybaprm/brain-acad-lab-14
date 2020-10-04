package ua.zp.brainacad;

import java.util.Objects;

public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Client client;

    public Shop(String name, String address, Manager manager, Cashier cashier, Security security, Client client) {
        this.name = name;
        this.address = address;
        this.manager = manager;
        this.cashier = cashier;
        this.security = security;
        this.client = client;
    }

    public void open() {
        System.out.println("Shop open.\n");
        Employee[] employees = {manager, cashier, security};
        for (Employee employee : employees) {
            employee.comeWork();
        }
    }

    public void goLunch() {
        System.out.println("\nShop close to the lunch.\n");
        Employee[] employees = {manager, cashier, security};
        for (Employee employee : employees) {
            employee.goLunch();
        }
    }

    public void sellProduct() {
        System.out.println("\nShop sell the product.\n");
        Human[] humans = {client, manager, cashier, security};
        for (Human human : humans) {
            if (human instanceof Client) {
                ((Client) human).learnProduct();
            }
            if (human instanceof Manager) {
                ((Manager) human).doWork();
                client.byeProduct();
            }
            if ((human instanceof Cashier) || (human instanceof Security))
                ((Employee) human).doWork();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(address, shop.address) &&
                Objects.equals(manager, shop.manager) &&
                Objects.equals(cashier, shop.cashier) &&
                Objects.equals(security, shop.security) &&
                Objects.equals(client, shop.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, manager, cashier, security, client);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", security=" + security +
                ", client=" + client +
                '}';
    }
}
