class BurgerKingRunner {
    public static void main(String args[]) {
        boolean isUserRegistered = BurgerKing.RegisterUser("Anjali", "B D", 700001, 9112233445L, "anju5951@gmail.com");
        if (isUserRegistered) {
            BurgerKing.getRegisterDetails();
        }
        System.out.println("The user is registered " + isUserRegistered);
    }
}
