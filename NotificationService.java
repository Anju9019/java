class NotificationService {
    public static void main(String notification[]) {
        System.out.println("Main Started");
        String reciver = "user@example.com";
        String message = "Your order has been shipped";
   NotificationHelper.sendNotification(reciver, message);  

 System.out.println("Main Ended");
    }
}
