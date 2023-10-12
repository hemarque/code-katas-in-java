import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class LeapYearsTest {
    private final LeapYears leapYears = new LeapYears();

    @ParameterizedTest
    @ValueSource(ints = {400, 800, 1200, 1600, 2000})
    public void yearIsLeapIfIsDivisibleBy400(int year) {
        assertTrue(leapYears.isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1700, 1800, 1900})
    public void yearIsNotLeapIfDivisibleBy100AndNotBy400(int year) {
        assertFalse(leapYears.isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2008, 2012, 2016})
    public void yearIsLeapIfDivisibleBy4ButNotBy100(int year) {
        assertTrue(leapYears.isLeap(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2017, 2018, 2019})
    public void yearNotDivisibleBy4AreNotLeap(int year) {
        assertFalse(leapYears.isLeap(year));
    }

    public boolean isLeap(int year) {
        return leapYears.isLeap(year);
    }

    private boolean isDivisibleBy4(int year) {
        return leapYears.isDivisibleBy4(year);
    }

    private boolean isDivisibleBy100(int year) {
        return leapYears.isDivisibleBy100(year);
    }

    private boolean isDivisibleBy400(int year) {
        return leapYears.isDivisibleBy400(year);
    }
}
