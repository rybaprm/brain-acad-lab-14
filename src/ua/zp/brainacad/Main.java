package ua.zp.brainacad;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop(
                "Some shop", "Some address",
                new Manager("Mr. Manager", "01.01.2001", "0501231212"),
                new Cashier("Mr. Cashier", "02.02.2002", "0502223344"),
                new Security("Mr. Security", "03.03.2003", "0503332266"),
                new Client("Mr. Client", "04.04.2004", "0667778822")
        );
        shop.open();
        shop.sellProduct();
        shop.goLunch();
    }
}
