public class Account implements AccountService {
    private final Printer printer;

    public Account(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void printStatement() {

    }
}
