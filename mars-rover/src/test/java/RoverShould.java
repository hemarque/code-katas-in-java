import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverShould {
    @Test
    public void startAtZeroZeroNorth(){
        MarsRover rover = new MarsRover();
        String command = "";
        assertEquals("0:0:N", rover.execute(command));
    }

    @Test
    public void moveNorthIfCommandIsMoveAtStartingPoint(){
        MarsRover rover = new MarsRover();
        String command = "M";
        assertEquals("0:1:N", rover.execute(command));
    }
}
