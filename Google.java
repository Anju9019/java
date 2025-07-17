class Google{
static 	long phoneNumber;
static String email;
static String password;
public static boolean createUser(long pNumber,String mail,String pass){
boolean phoneNumberValid=false;
boolean emailValid=false;
boolean passwordValid =false;
boolean isUserCreated=false;
if(pNumber!=0){
phoneNumber=pNumber;
phoneNumberValid=true;
}
if(mail!=null){
email=mail;                  
emailValid=true;
}
if(pass!=null){
password=pass;
passwordValid=true;
}	
if(phoneNumberValid==true && phoneNumberValid==true && passwordValid==true){
isUserCreated=true;
}
return isUserCreated;
}
public static void getUserInfo(){
 System.out.println("The phone Number  is "+ phoneNumber);
  System.out.println("the email Name is"+ email);
  System.out.println("the password is"+ password);
  }
  }
  
