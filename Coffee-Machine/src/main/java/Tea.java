public class Tea {
    private int sugar;

    public Tea(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        String sugar = ((this.sugar == 0) ? "" : (this.sugar + ""));
        return "T:"+sugar+":";
    }
}
