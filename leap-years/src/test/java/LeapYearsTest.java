import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.TestCase.assertTrue;

public class LeapYearsTest {
    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600, 2000})
    public void yearIsLeapIfIsDivisibleBy400(int year) {
        assertTrue(isLeap(year));
    }

    private boolean isLeap(int year) {
        boolean isLeap = year % 400 == 0;
        return isLeap;
    }
}
