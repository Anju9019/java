class CustomerService {
    public static void main(String[] CustomerService) {
        System.out.println("Main Started");
        String customerName = "Anjali";
        String query = "Where is my order 123?";
     CustomerHelper.handleQuery(customerName, query);  
        System.out.println("Main Ended");
    }
}
