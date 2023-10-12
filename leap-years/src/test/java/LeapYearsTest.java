import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class LeapYearsTest {
    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600, 2000})
    public void yearIsLeapIfIsDivisibleBy400(int year) {
        assertTrue(isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1700, 1800, 1900})
    public void yearIsNotLeapIfDivisibleBy100AndNotBy400(int year) {
        assertFalse(isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2008, 2012, 2016})
    public void yearIsLeapIfDivisibleBy4ButNotBy100(int year){
        assertTrue(isLeap(year));
    }

    private boolean isLeap(int year) {
        return isDivisibleBy400(year) ||
                !(isDivisibleBy100(year) && !isDivisibleBy400(year)) ||
                (isDivisibleBy4(year) &&(!isDivisibleBy100(year)));
    }

    private boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    private boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

    private boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }
}
