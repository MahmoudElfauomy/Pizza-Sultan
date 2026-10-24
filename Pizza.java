import java.util.ArrayList;

public class Pizza extends ITEM {
    private Sizes Type;
    private ArrayList<Extras> Adds = new ArrayList<>();

    Pizza(String name, int price, boolean available, Sizes Type) {
        super(name, price, available);
        this.Type = Type;
    }

    void Add_Extras(Extras edafa) {
        if (Adds.contains(edafa)) {
            throw new IllegalArgumentException("Extra already added");
        }
        Adds.add(edafa);
    }

    ArrayList<Extras> Get_Edafat() {
        return this.Adds;
    }

    Sizes GetType() {
        return this.Type;
    }

    int TotalPrice() {
        int Total = super.Price() + Type.getPrice();
        for (Extras it : Adds) {
            Total = Total + it.getPrice();
        }
        return Total;
    }
}
