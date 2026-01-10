class NoukariRunner {
	public static void main(String chandu[]){
		String mail = "Narsu9611@gmail.com";
		String pwd = "narsu34@.";
		long phoneNo = 9611590710L;
		
		String maillogIn = Noukari.logIn(mail,pwd);
		System.out.println(" The User Name is "+maillogIn+" and the email is "+mail);
		
		String phoneNologIn = Noukari.logIn(phoneNo,pwd);
		System.out.println(" The user Name is "+phoneNologIn+" and the phoneNo is "+phoneNo);
	}
}