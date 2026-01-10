class ApnaRunner {
	public static void main(String chandu[]){
		String mail = "kavya34@gmail.com";
		String pwd = "kavya@32";
		long phoneNo = 9645324321L;
		
		String maillogIn = Apna.logIn(mail,pwd);
		System.out.println(" The User Name is "+maillogIn+" and the email is "+mail);
		
		String phoneNologIn = Apna.logIn(phoneNo,pwd);
		System.out.println(" The user Name is "+phoneNologIn+" and the phoneNo is "+phoneNo);
	}
}