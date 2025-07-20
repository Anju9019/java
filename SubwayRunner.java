class SubwayRunner {
    public static void main(String pizza[]) {
        boolean isUserRegistered = Subway.RegisterUser("Anjali", "B D", 400001, 9123456789L, "anju5951@gmail.com");
        if (isUserRegistered) {
            Subway.getRegisterDetails();
        }
        System.out.println("The user is registered " + isUserRegistered);
    }
}
