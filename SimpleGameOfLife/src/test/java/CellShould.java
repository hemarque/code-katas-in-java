import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellShould {

    @Test
    public void beAliveIfWeOrderItToLive(){
        Cell cell = new Cell();
        cell.live();
        assertTrue(cell.isAlive());
    }


    //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
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

    //Any live cell with two or three live neighbors lives on to the next generation.
    @Test
    public void livesIfItIsAliveAndHaveTwoNeighbours(){
        Cell cell = new Cell();
        cell.live();
        cell.hasThisNumberOfNeighbours(2);
        assertTrue(cell.nextGeneration().isAlive());
    }

    @Test
    public void livesIfItIsAliveAndHaveThreeNeighbours(){
        Cell cell = new Cell();
        cell.live();
        cell.hasThisNumberOfNeighbours(3);
        assertTrue(cell.nextGeneration().isAlive());
    }

    //Any live cell with more than three live neighbors dies, as if by overpopulation.
    @Test
    public void dieIfItIsAliveAndHaveMoreThanThreeNeighbours(){
        Cell cell = new Cell();
        cell.live();
        cell.hasThisNumberOfNeighbours(4);
        assertFalse(cell.nextGeneration().isAlive());
    }
}
