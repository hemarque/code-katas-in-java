import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepositoryShould {
    @Test
    public void storeTransaction() {
        Repository repository = new Repository();
        Transaction transaction = new Transaction(100);
        repository.addTransaction(transaction);
        assertTrue(repository.getAllTransactions().indexOf(transaction) >= 0);
    }
}
