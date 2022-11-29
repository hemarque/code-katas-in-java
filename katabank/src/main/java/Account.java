public class Account implements AccountService {
    private final Repository repository;


    public Account(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(int amount) {
        repository.addTransaction(amount);
    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void printStatement() {
    }
}