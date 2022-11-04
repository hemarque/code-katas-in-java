import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CellShould {
    @Test
    public void dieIfItHasNoNeighbours() {
        Cell originalCell = new Cell();
        Cell nextIterationCell = originalCell.nextGeneration();
        assertFalse(nextIterationCell.isAlive());
    }

    @Test
    public void dieIfItHasJustOneNeighbour() {
        Cell originalCell = new Cell();
        originalCell.setNeighbours(1);
        Cell nextIterationCell = originalCell.nextGeneration();
        assertFalse(nextIterationCell.isAlive());
    }
}
