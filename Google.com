	class Google{
static 	int phoneNumber;
static String email;
static String password;
public static boolean createUser(int pNumber,string mail,String pass){
boolean phoneNumberValid=false;
boolean mailNameValid=false;
boolen  passValid=false;
boolean isUserCreated=false;
if(pName!=null){
phoneNumer=pNumber;
phoneNameValid=true;
}
if(mailName!=null){
mail=mail;                  
mailNameValid=true;
}
if(phoneNumberValid==true && phoneNumberValid==true){
isUserCreated=true;
}
return isUserCreated;
}
public static void getUserInfo(){
 System.out.println("The phone Number  is "+ phoneNumber);
  System.out.println("the email Name is"+ emailName);
  System.out.println("the password is"+ password);
  }
  }
