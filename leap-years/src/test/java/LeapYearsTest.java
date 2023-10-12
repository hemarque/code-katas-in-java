import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class LeapYearsTest {
    @Test
    public void beLeapIfIsDivisibleBy400(){
        int year = 400;

        boolean isLeap = year % 400 == 0;

        assertTrue(isLeap);
    }
}
