public class FizzBuzz {
    public String of(int number) {
        if(number == 3)
            return "Fizz";
        if(number == 5)
            return "Buzz";
        return String.valueOf(number);
    }
}
