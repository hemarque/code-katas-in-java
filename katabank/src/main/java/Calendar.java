import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {
    public String today() {
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }
}
