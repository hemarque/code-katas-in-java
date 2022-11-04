public class Cell {
    private int neighbours;

    public Cell nextGeneration() {
        return new Cell();
    }

    public boolean isAlive() {
        return false;
    }

    public void setNeighbours(int neighbours) {
        this.neighbours = neighbours;
    }
}
