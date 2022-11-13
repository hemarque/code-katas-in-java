public class Order {
    private final String type;
    private int sugar = 0;

    public Order(String type, int sugar) {
        this.type = type;
        this.sugar = sugar;
    }

    public int getSugar() {
        return this.sugar;
    }
}
