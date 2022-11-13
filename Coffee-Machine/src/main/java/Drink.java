public class Drink {
    String type = "D";
    boolean withStick;
    int sugar;

    public Drink(int sugar, boolean withStick) {
        this.sugar = sugar;
        this.withStick = withStick;
    }

    @Override
    public String toString() {
        String sugar = ((this.sugar == 0) ? "" : (this.sugar + ""));
        String stick = (this.withStick || this.sugar > 0) ? "0" : "";
        return type + ":" + sugar + ":" + stick;
    }
}
