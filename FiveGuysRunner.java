class FiveGuysRunner {
    public static void main(String args[]) {
        boolean isUserRegistered = FiveGuys.RegisterUser("Anjali", "B D", 400004, 9666777888L, "anju5951@gmail.com");

        if (isUserRegistered) {
            FiveGuys.getRegisterDetails();
        }

        System.out.println("The user is registered " + isUserRegistered);
    }
}
