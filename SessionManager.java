class SessionManager {
    public static void main(String[] args) {
        System.out.println("Main Started");
        String sessionId = "ABC123";
        int timeoutMinutes = 30;
        SessionHelper.manageSession(sessionId, timeoutMinutes);  
        System.out.println("Main Ended");
    }
}
