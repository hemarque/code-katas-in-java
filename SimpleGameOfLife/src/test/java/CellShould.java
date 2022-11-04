import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellShould {
    //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
    @Test
    public void beAliveIfWeOrderItToLive(){
        Cell cell = new Cell();
        cell.live();
        assertTrue(cell.isAlive());
    }

    @Test
    public void dieIfItIsAliveAndHaveNoNeighbours(){
        Cell cell = new Cell();
        cell.live();
        cell.hasThisNumberOfNeighbours(0);
        assertFalse(cell.nextGeneration().isAlive());
    }

    @Test
    public void dieIfItIsAliveAndHaveJustOneNeighbour(){
        Cell cell = new Cell();
        cell.live();
        cell.hasThisNumberOfNeighbours(1);
        assertFalse(cell.nextGeneration().isAlive());
    }
}
