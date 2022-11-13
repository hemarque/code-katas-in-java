public class DrinkMaker {
    private OrderValidator validator;

    public DrinkMaker(OrderValidator validator) {
        this.validator = validator;
    }

    public void make(String order) {
        validator.validate(order);
    }
}
