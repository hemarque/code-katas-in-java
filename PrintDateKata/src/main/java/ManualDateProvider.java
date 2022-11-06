import java.util.ArrayList;
import java.util.Date;

public class ManualDateProvider implements DateProvider {
    ArrayList <Date> dateCalls = new ArrayList<>();

    private Date date;
    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        dateCalls.add(date);
        return this.date;
    }

    public boolean hasBeenCalledWithTheDate(Date currentDate) {
        return this.dateCalls.contains(currentDate);
    }
}
