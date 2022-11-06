import jdk.jshell.spi.ExecutionControl;

import java.util.Date;

public class CurrentDateProvider implements DateProvider {
    public Date getDate() throws Exception {
        throw new Exception("Not implemented yet!");
    }
}
