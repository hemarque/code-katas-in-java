public class Account implements AccountService {
    public static final String HEADER = "Date       || Amount || Balance";
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
        printHeader();
        printTransactions();
    }

    private void printTransactions() {
        for(Transaction transaction : repository.getAllTransactions()){
            printTransaction(transaction);
        }
    }

    private void printTransaction(Transaction transaction) {
        console.printLine(transaction.toString());
    }

    private void printHeader() {
        console.printLine(HEADER);
    }

    public int getBalance() {
        return balance;
    }
}
