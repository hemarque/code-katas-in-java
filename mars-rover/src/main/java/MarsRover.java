public class MarsRover {
    private int x = 0;
    private int y = 0;
    private char direction = 'N';

    public String execute(String command) {
        if (command.equals("M")) {
            y++;
        }
        return x + ":" + y + ":" + direction;
    }
}
