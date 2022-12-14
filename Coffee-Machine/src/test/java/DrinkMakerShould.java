import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DrinkMakerShould {
    @Test
    public void sendTheOrderToMakeATeaWithoutSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Tea tea = new Tea(0, false);

        maker.make(tea);

        verify(sender).send("T::");
    }
    @Test
    public void sendTheOrderToMakeATeaWithOneSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Tea tea = new Tea(1, true);

        maker.make(tea);

        verify(sender).send("T:1:0");
    }

    @Test
    public void sendTheOrderToMakeATeaWithTwoSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Tea tea = new Tea(2, true);

        maker.make(tea);

        verify(sender).send("T:2:0");
    }

    @Test
    public void sendTheOrderToMakeATeaWithTwoSugarAndAStick() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Tea tea = new Tea(2, true);

        maker.make(tea);

        verify(sender).send("T:2:0");
    }

    @Test
    public void includeAStickIfTheOrderIncludesSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Tea tea = new Tea(1, false);

        maker.make(tea);

        verify(sender).send("T:1:0");
    }

    @Test
    public void sendTheOrderToMakeACoffeeWithTwoSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Coffee coffee = new Coffee(2, false);

        maker.make(coffee);

        verify(sender).send("C:2:0");
    }

    @Test
    public void sendTheOrderToMakeAChocolateWithOneSugar() {
        MachineSender sender = mock(MachineSender.class);
        DrinkMaker maker = new DrinkMaker(sender);
        Chocolate chocolate = new Chocolate(1, false);

        maker.make(chocolate);

        verify(sender).send("H:1:0");
    }

}
