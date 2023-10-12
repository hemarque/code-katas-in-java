public class LeapYears {
    public LeapYears() {
    }

    public boolean isLeap(int year) {
        return isDivisibleBy400(year) ||
                (isDivisibleBy4(year) && !isDivisibleBy100(year));
    }

    boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

    boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }
}