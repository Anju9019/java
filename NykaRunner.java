class NykaRunner{
public static void main(String[] anju){
String mail="anju@gmail.com" ;
String pwd="@anju54";
long phone=  8976452312L;
String NykaemaillogIn=Nyka.logIn(mail , pwd);
System.out.println(" the name of the amazon user is: " +NykaemaillogIn +" and the email is " +mail );
String NykaphonelogIn=Nyka.logIn(phone , pwd);
System.out.println(" the name of the amazon user is: " +NykaphonelogIn+ " and the phoneNumber is "+phone);

}
}