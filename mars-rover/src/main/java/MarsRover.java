public class MarsRover {
    private static final String STARTING_POSITION = "0:0:N";


    public String execute(String command) {
        String response;
        if(command.equals("M")){
            response = "0:1:N";
        }else{
            response = STARTING_POSITION;
        }
        return response;
    }
}
