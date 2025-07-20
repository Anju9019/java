class DominosRunner {
	public static void main(String pizza[]){
		boolean isUserRegistered = Dominos.RegisterUser("Anjali","B D",560062,9019374563L,"anju5951@gmail.com");
		if(isUserRegistered)
		Dominos.getRegisterDetails();
	    System.out.println("The user is registered "+isUserRegistered);
	}
}
