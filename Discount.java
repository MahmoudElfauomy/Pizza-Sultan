import java.util.List;

public class Discount {
    double clc1(int subtotal) {
        return (subtotal >= 500 ? 0.1 : 0.0);
    }

    double clc2(int subtotal, List<ITEM> items) {
        int count = 0;
        for (ITEM it : items) {
            if (it.Name().contains("Pizza")) count += 1;
        }
        return (subtotal >= 300 && count > 1 ? 0.15 : 0.0);
    }
}
