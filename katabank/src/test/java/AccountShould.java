import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountShould {
    @Test
    public void storeDeposit(){
        Repository repository = mock(Repository.class);
        Account account = new Account(repository, null);
        account.deposit(100);
        verify(repository).addTransaction(any());
    }

    @Test
    public void storeWithdraw(){
        Repository repository = mock(Repository.class);
        Account account = new Account(repository, null);
        account.withdraw(100);
        verify(repository).addTransaction(any());
    }

    @Test
    public void storeBalance(){
        Repository repository = new Repository();
        Account account = new Account(repository, null);

        account.deposit(100);
        account.deposit(300);
        account.withdraw(50);

        assertEquals(350, account.getBalance());
    }
}
