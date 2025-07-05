class PasswordReset {
    public static void main(String[] PasswordReset) {
        System.out.println("Main Started");
        String username = "alice123";
        String tempPassword = "abcXYZ789";
        ResetHelper.resetPassword(username, tempPassword);
        System.out.println("Main Ended");
    }
}
