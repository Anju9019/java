class Noukari{
	public static String logIn(String email, String password){
		String name = null;
		if(email == "anju23@gmail.com"){
			password = "anju@12";
			name = "Anjali B D";
			return name;
		}
		if(email == "Narsu9611@gmail.com"){
			password = "narsu34@.";
			name = "Narshimha B S";
			return name;
		}
		return name;
	}
	public static String logIn(long phoneNumber, String password){
		String name = null;
		if(phoneNumber == 9874757534L){
			password = "anju@12";
			name = "Anjali B D ";
			return name;
		}
		if(phoneNumber == 9611590710L){
			password = "narsu34@.";
			name = "Narshimha B S ";
			return name;
		}
		return name;
	}
}