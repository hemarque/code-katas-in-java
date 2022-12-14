public class Cell {
    private boolean lives = false;
    private int neighbours = 0;

    public Cell nextGeneration() {
        Cell nextGeneration = new Cell();
        if (isAlive() && (neighbours == 2 || neighbours == 3))
            nextGeneration.live();
        else if (!isAlive() && neighbours == 3)
            nextGeneration.live();
        return nextGeneration;
    }

    public void live() {
        this.lives = true;
    }

    public void die() {
        this.lives = false;
    }

    public boolean isAlive() {
        return this.lives;
    }

    public void hasThisNumberOfNeighbours(int neighbours) {
        this.neighbours = neighbours;
    }
}
