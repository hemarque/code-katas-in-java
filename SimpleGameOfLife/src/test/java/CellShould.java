import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellShould {
    //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
    @Test
    public void beAliveIfWeOrderItToLive(){
        Cell cell = new Cell();
        cell.live();
        assertTrue(cell.isAlive());
    }
}
