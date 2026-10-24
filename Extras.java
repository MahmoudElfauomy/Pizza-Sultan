public enum Extras {
    NONE(0), OLIVES(30), CHEESE(15);
    int extraPrice;

    Extras(int price) {
        this.extraPrice = price;
    }

    int getPrice() {
        return this.extraPrice;
    }
}
