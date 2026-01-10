class MythraRunner{
public static void main(String anju[]){
String name="anju" ;
String pwd="@anju54";
long phone=  8976452312L;
String MythraUser =Mythra.logIn(name , pwd);
System.out.println("the name of the mythra user is:" +MythraUser +"and the name is" +name );
String MythranUser=Mythra.logIn(phone , pwd);
System.out.println("the name of the mythra user is:" +MythranUser+ " and phone number is "+phone );

}
}