public class Cell {
    private boolean lives = false;
    private int neighbours = 0;

    public void live() {
        this.lives = true;
    }

    public boolean isAlive() {
        return this.lives;
    }

    public void hasThisNumberOfNeighbours(int neighbours) {
        this.neighbours = neighbours;
    }

    public Cell nextGeneration() {
        Cell nextGeneration = new Cell();
        if (neighbours == 2)
            nextGeneration.live();
        return nextGeneration;
    }
}
