import java.util.Date;

public class DatePrinter {
    private final DateProvider dateProvider;

    public DatePrinter(DateProvider dateProvider) {
        this.dateProvider = dateProvider;
    }

    public void printCurrentDate() {
        System.out.println(dateProvider.getDate());
    }
}
