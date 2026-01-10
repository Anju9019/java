class Nyka{
public static String logIn(String email , String password){
String name = null;

if(email == "anju@gmail.com"){
password="@anju54";
name = "anju";
return name;
}

if(email == "nehu21@gmail.com"){
password = "@nehu21";
name="nehu";
return name;
}
return name;
}
public static String logIn(long phoneNumber , String password){
String name = null;

if(phoneNumber == 8976452312L){
password="@anju54";
name = "anju";
return name;
}

if(phoneNumber == 9876333842L){
password = "@nehu21";
name="nehu";
return name;
}

return name;
}
}