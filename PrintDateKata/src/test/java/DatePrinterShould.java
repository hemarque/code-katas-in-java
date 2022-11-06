import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatePrinterShould {
    @Test
    public void settingDateOnAManualDateProvider() {
        Date currentDate = Date.from(Instant.parse("2022-11-06T10:00:00.00Z"));
        ManualDateProvider dateProvider = new ManualDateProvider();

        dateProvider.setDate(currentDate);

        assertEquals(currentDate, dateProvider.getDate());
    }

    @Test
    public void callTheManualDateProviderToPrintTheDate() {
        Date currentDate = Date.from(Instant.parse("2022-11-06T10:00:00.00Z"));
        ManualDateProvider dateProvider = new ManualDateProvider();
        dateProvider.setDate(currentDate);

        DatePrinter printer = new DatePrinter(dateProvider);
        printer.printCurrentDate();

        assertTrue(dateProvider.hasBeenCalledWithTheDate(currentDate));
    }
}
