import javax.swing.*;

public class ITEM {

    private String name;
    private int price;
    private boolean available;

    ITEM(String name, int price, boolean availble) {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        if (name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.available = availble;
        this.name = name;
        this.price = price;
    }

    Boolean check_Availbility() {
        return this.available;
    }

    int Price() {
        return this.price;
    }

    String Name() {
        return this.name;
    }
}
