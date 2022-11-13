public class DrinkMaker {
    private final MachineSender sender;

    public DrinkMaker(MachineSender sender) {
        this.sender = sender;
    }

    public void make(Drink drink) {
        sender.send(drink.toString());
    }
}
