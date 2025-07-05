class DatabaseConnector {
    public static void main(String Database[]) {
        System.out.println("Main Started");
        String username = "admin";
        String password = "secret";
        DBHelper.connectDatabase( username, password);  
        System.out.println("Main Ended");
    }
}
