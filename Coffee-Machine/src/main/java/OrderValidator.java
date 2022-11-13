import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderValidator {
    public void validate(String order) {
        Pattern pattern = Pattern.compile("[THCM]:.*:?.*");
        Matcher matcher = pattern.matcher(order);
        if(!matcher.find())
            throw new BadOrderFormatException();
    }
}
