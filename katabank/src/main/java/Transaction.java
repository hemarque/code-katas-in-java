public class Transaction {
    private final int amount;
    private final int balance;
    private final String date;

    public Transaction(String date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public String toString(){
        return date + " || " + amount + "   || " + balance;
    }
}
