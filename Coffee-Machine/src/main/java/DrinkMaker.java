public class DrinkMaker {
    private OrderValidator validator;
    private Order currentOrder;

    public DrinkMaker(OrderValidator validator) {
        this.validator = validator;
    }

    public void make(String order) {
        validator.validate(order);
        String[] details = order.split(":");
        this.currentOrder = new Order(details[0], Integer.parseInt(details[1]));
    }

    public Order getCurrentOrder() {
        return this.currentOrder;
    }
}
