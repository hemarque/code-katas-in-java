public class Tea {
    private final boolean withStick;
    private int sugar;

    public Tea(int sugar, boolean withStick) {
        this.sugar = sugar;
        this.withStick = withStick;
    }

    @Override
    public String toString() {
        String sugar = ((this.sugar == 0) ? "" : (this.sugar + ""));
        String stick = this.withStick ? "0" : "";
        return "T:" + sugar + ":" + stick;
    }
}
