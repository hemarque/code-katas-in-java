public class DrinkMaker {
    private final MachineSender sender;

    public DrinkMaker(MachineSender sender) {
        this.sender = sender;
    }

    public void make(Tea tea) {
        sender.send(tea.toString());
    }
}
