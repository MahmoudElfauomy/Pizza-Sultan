public enum Sizes {
    SMALL(0), MEDIUM(30), LARGE(50);
    int extraPrice;

    Sizes(int price) {
        this.extraPrice = price;
    }

    int getPrice() {
        return this.extraPrice;
    }
}
