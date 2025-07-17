class Mythra{
public static String logIn(String name,String password){
String loginForm = null;

if(name == "anju"){
password="@anju54";
loginForm = "Login Account through anju";
return loginForm;
}

if(name == "narsu"){
password = "@narsu21";
loginForm = "Login Account through narshimha";
return loginForm;
}
return loginForm;
}

public static String logIn(long phoneNumber , String password){
String loginForm = null;

if(phoneNumber == 8976452312L){
password="@anju54";
loginForm = "Login Account through anju";
return loginForm;
}

if(phoneNumber == 9876333842L){
password = "narsu21";
loginForm = "Login Account through narshimha";
return loginForm;
}

return loginForm;
}
}