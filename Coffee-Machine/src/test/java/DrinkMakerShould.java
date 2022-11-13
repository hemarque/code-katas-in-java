import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DrinkMakerShould {
    @Test
    public void receiveTheCorrectInstructionsForMyOrder() {
        String order = "";
        OrderValidator validator = mock(OrderValidator.class);
        DrinkMaker maker = new DrinkMaker(validator);

        maker.make(order);

        verify(validator).validate(order);
    }
}
