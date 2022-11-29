public class Account implements AccountService {
    public static final String HEADER = "Date       || Amount || Balance";
    private final Repository repository;
    private final Console console;
    private final Calendar calendar;

    private int balance = 0;


    public Account(Repository repository, Console console, Calendar calendar) {
        this.repository = repository;
        this.console = console;
        this.calendar = calendar;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        repository.addTransaction(new Transaction(calendar.today(), amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        repository.addTransaction(new Transaction(calendar.today(), amount*-1, balance));
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
