class WendysRunner {
    public static void main(String args[]) {
        boolean isUserRegistered = Wendys.RegisterUser("Anjali", "B D", 300003, 9777888999L, "anju5951@gmail.com");

        if (isUserRegistered) {
            Wendys.getRegisterDetails();
        }

        System.out.println("The user is registered " + isUserRegistered);
    }
}
