class OrderValidator {
    public static void main(String[] OrderValidator) {
        System.out.println("Main Started");
        int orderId = 789;
        double amount = 299.99;
        ValidatorHelper.validateOrder(orderId, amount);
        System.out.println("Main Ended");
    }
}
