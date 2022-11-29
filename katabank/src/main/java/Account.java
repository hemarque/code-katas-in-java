public class Account implements AccountService {
    private final Repository repository;


    public Account(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(int amount) {
        repository.addTransaction(new Transaction(amount));
    }

    @Override
    public void withdraw(int amount) {
        repository.addTransaction(new Transaction(amount*-1));
    }

    @Override
    public void printStatement() {
    }
}
