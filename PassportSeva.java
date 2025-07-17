class PassportSeva{
static String givenName;
static String surName;
  public static boolean registerUser(String gName,String sName){
  boolean IsUserRegistered=false;
  boolean givenNameValid=false;
  boolean surNameValid=false;
  if(gName!=null){
  givenName=gName;
  givenNameValid=true;
  }
  if(sName!=null){
  surName=sName;
  surNameValid = true;
  }
  if(givenNameValid==true && givenNameValid==true){
  IsUserRegistered=true;
  }
  return IsUserRegistered;
  }
  public static void getUserInfo(){
	  
  System.out.println("The given name is "+givenName);
  System.out.println("the sur Name is"+surName);
  
  }
}