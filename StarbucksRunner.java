class StarbucksRunner {
    public static void main(String args[]) {
        boolean isUserRegistered = Starbucks.RegisterUser("Anjali", "B D", 500001, 9333344444L, "anju5951@gmail.com");

        if (isUserRegistered) {
            Starbucks.getRegisterDetails();
        }

        System.out.println("The user is registered " + isUserRegistered);
    }
}
