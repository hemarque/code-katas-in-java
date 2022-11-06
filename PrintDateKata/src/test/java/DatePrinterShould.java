import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatePrinterShould {
    @Test
    public void settingDateOnAManualDateProvider() {
        Date currentDate = Date.valueOf("2022-11-06");
        ManualDateProvider dateProvider = new ManualDateProvider();

        dateProvider.setDate(currentDate);

        assertEquals(currentDate, dateProvider.getDate());
    }
}
