import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DrinkMakerShould {
    @Test
    public void receiveTheCorrectInstructionsForMyOrder() {
        String order = "T:1:";
        OrderValidator validator = mock(OrderValidator.class);
        DrinkMaker maker = new DrinkMaker(validator);

        maker.make(order);

        verify(validator).validate(order);
    }

    @Test
    public void addOneSugarIfIOrderIt() {
        String order = "T:1:";
        OrderValidator validator = new OrderValidator();
        DrinkMaker maker = new DrinkMaker(validator);

        maker.make(order);

        assertEquals(1, maker.getCurrentOrder().getSugar());
    }

    @Test
    public void addTwoSugarIfIOrderIt() {
        String order = "T:2:";
        OrderValidator validator = new OrderValidator();
        DrinkMaker maker = new DrinkMaker(validator);

        maker.make(order);

        assertEquals(2, maker.getCurrentOrder().getSugar());
    }
}
