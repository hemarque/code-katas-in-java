import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DrinkMakerShould {
    @Test
    public void sendTheOrderToMakeATeaWithoutSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Tea tea = new Tea(0);

        maker.make(tea);

        verify(sender).send("T::");
    }
    @Test
    public void sendTheOrderToMakeATeaWithOneSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Tea tea = new Tea(1);

        maker.make(tea);

        verify(sender).send("T:1:");
    }

}
