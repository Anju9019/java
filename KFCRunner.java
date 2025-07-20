class KFCRunner {
    public static void main(String chicken[]) {
        boolean isUserRegistered = KFC.RegisterUser("Anjali", "B D", 600001, 9988776655L, "anju5951@gmail.com");
        if (isUserRegistered) {
            KFC.getRegisterDetails();
        }
        System.out.println("The user is registered " + isUserRegistered);
    }
}
