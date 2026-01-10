class WorkIndiaRunner {
	public static void main(String chandu[]){
		String mail = "anju23@gmail.com";
		String pwd = "anju@12";
		long phoneNo = 9874757534L;
		
		String maillogIn = WorkIndia.logIn(mail,pwd);
		System.out.println(" The User Name is "+maillogIn+" and the email is "+mail);
		
		String phoneNologIn = WorkIndia.logIn(phoneNo,pwd);
		System.out.println(" The user Name is "+phoneNologIn+" and the phoneNo is "+phoneNo);
	}
}