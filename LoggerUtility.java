class LoggerUtility {
    public static void main(String[] logger) {
		 System.out.println("Main Started");
    String source = "AuthService";
    String message = "User login successful";
    LogHelper.logInfo(source, message);  
	        System.out.println("Main Ended");

    }
}
