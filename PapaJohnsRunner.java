class PapaJohnsRunner {
    public static void main(String args[]) {
        boolean isUserRegistered = PapaJohns.RegisterUser("Anjali", "B D", 100011, 9444555666L, "anju5951@gmail.com");

        if (isUserRegistered) {
            PapaJohns.getRegisterDetails();
        }

        System.out.println("The user is registered " + isUserRegistered);
    }
}
