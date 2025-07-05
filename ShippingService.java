class ShippingService {
    public static void main(String[] ShippingService) {
        System.out.println("Main Started");
        int orderId = 555;
        double weightKg = 12.5;
        ShippingHelper.shipOrder(orderId, weightKg);  
        System.out.println("Main Ended");
    }
}
