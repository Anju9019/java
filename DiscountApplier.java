class DiscountApplier {
    public static void main(String[] DiscountApplier) {
        System.out.println("Main Started");
        double price = 2000.00;
        double discountPercent = 15.0;
        DiscountHelper.applyDiscount(price, discountPercent); 
        System.out.println("Main Ended");
    }
}
