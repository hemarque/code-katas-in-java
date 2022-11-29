import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Transaction> transactions = new ArrayList<>();
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}
