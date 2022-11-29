import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Repository {
    private Deque<Transaction> transactions = new ArrayDeque<>();

    public void addTransaction(Transaction transaction) {
        transactions.addFirst(transaction);
    }

    public Deque<Transaction> getAllTransactions() {
        return transactions;
    }
}
