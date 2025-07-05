class SystemChecker {
    public static void main(String[] SystemChecker ) {
        System.out.println("Main Started");
        String systemName = "AuthService";
        boolean isCritical = true;
        SystemHelper.checkSystem(systemName, isCritical);  
        System.out.println("Main Ended");
    }
}
