class Apna{
	public static String logIn(String email, String password){
		String name = null;
		if(email == "kavya34@gmail.com"){
			password = "kavya@32";
			name = "Kavya";
			return name;
		}
		if(email == "sridhar9611@gmail.com"){
			password = "srdhar56@";
			name = "sridhar";
			return name;
		}
		return name;
	}
	public static String logIn(long phoneNumber, String password){
		String name = null;
		if(phoneNumber == 9645324321L){
			password = "kavya@32";
			name = "kavya";
			return name;
		}
		if(phoneNumber == 2345671298L){
			password = "srdhar56@";
			name = "sridhar ";
			return name;
		}
		return name;
	}
}