import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

public class DrinkMakerShould {
    @Test
    public void setupTest() {
        DrinkMaker maker = mock(DrinkMaker.class);

        assertNotNull(maker);
    }
}
