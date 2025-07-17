class PassportSevaRunner{
public static void main(String seva[]){
boolean IsUserRegistered=PassportSeva.registerUser("anju","anjali");
System.out.println(" is User Registered "+IsUserRegistered);
PassportSeva.getUserInfo();
}
}