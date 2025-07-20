class PizzaHutRunner {
    public static void main(String pizza[]){
        boolean isUserRegistered = PizzaHut.RegisterUser("Anjali", "B D", 110001, 9876543210L, "anju5951@gmail.com");
        if (isUserRegistered) {
        PizzaHut.getRegisterDetails();
        }
        System.out.println("The user is registered " + isUserRegistered);
    }
}
