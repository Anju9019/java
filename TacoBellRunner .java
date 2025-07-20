class TacoBellRunner {
    public static void main(String args[]) {
        // Unique phone number and pin code
        boolean isUserRegistered = TacoBell.RegisterUser("Anjali", "B D", 900001, 9876501234L, "anju5951@gmail.com");

        if (isUserRegistered) {
            TacoBell.getRegisterDetails();
        }

        System.out.println("The user is registered " + isUserRegistered);
    }
}
