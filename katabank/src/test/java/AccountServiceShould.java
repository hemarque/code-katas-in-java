import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountServiceShould {
    @Test
    public void printStatementContainingAllTransactions() {
        Console console = mock(Console.class);
        Repository repository = mock(Repository.class);
        AccountService account = new Account(repository);

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();

        verify(console).printLine("Date       || Amount || Balance");
        verify(console).printLine("14/01/2012 || -500   || 2500");
        verify(console).printLine("13/01/2012 || 2000   || 3000");
        verify(console).printLine("10/01/2012 || 1000   || 1000");
    }
}
