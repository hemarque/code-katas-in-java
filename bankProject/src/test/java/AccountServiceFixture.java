import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountServiceFixture {
    /*
    Date       || Amount || Balance
    14/01/2012 || -500   || 2500
    13/01/2012 || 2000   || 3000
    10/01/2012 || 1000   || 1000
     */

    Printer printer = mock(Printer.class);

    @Test
    public void accountServiceMustPrintTransactions(){
        AccountService service = new Account(printer);

        service.deposit(1000);
        service.deposit(2000);
        service.withdraw(500);

        service.printStatement();

        verify(printer).printAllTransactions();

    }
}
