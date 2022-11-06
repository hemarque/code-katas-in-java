import java.util.Date;

public class DatePrinter {
    private final ManualDateProvider dateProvider;

    public DatePrinter(ManualDateProvider dateProvider) {
        this.dateProvider = dateProvider;
    }

    public void printCurrentDate() {
        System.out.println(dateProvider.getDate());
    }
}
