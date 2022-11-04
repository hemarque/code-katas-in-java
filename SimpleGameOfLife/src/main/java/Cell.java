public class Cell {
    private boolean lives = false;

    public void live() {
        this.lives = true;
    }

    public boolean isAlive() {
        return this.lives;
    }
}
