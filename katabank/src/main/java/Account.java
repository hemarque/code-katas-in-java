public class Account implements AccountService {
    private final Repository repository;
    private final Console console;

    private int balance = 0;


    public Account(Repository repository, Console console) {
        this.repository = repository;
        this.console = console;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        repository.addTransaction(new Transaction(amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        repository.addTransaction(new Transaction(amount*-1, balance));
    }

    @Override
    public void printStatement() {
        console.printLine("Date       || Amount || Balance");
        
    }

    public int getBalance() {
        return balance;
    }
}
