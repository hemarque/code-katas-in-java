import org.junit.jupiter.api.Test;


import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountServiceShould {
    @Test
    public void printStatementContainingAllTransactions() {
        Console console = mock(Console.class);
        Calendar calendar = mock(Calendar.class);
        given(calendar.today()).willReturn("10/01/2012", "13/01/2012", "14/01/2012");
        Repository repository = new Repository();
        AccountService account = new Account(repository, console, calendar);

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();

        verify(console).printLine("Date       || Amount || Balance");
        verify(console).printLine("14/01/2012 || -500   || 2500");
        verify(console).printLine("13/01/2012 || 2000   || 3000");
        verify(console).printLine("10/01/2012 || 1000   || 1000");
    }

    @Test
    public void printStatementContainingAllTransactionsForReal() {
        AccountService account = new Account(new Repository(), new Console(), new Calendar());

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();
    }
}
