import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountShould {
    @Test
    public void storeTransactions(){
        Repository repository = mock(Repository.class);
        Account account = new Account(repository);
        account.deposit(100);
        verify(repository).addTransaction(100);
    }
}
