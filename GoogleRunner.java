class GoogleRunner{
public static void main(String google[]){
boolean isUserCreated=Google.createUser(123467899L,"anjumail","anju1234");
System.out.println(" is User Registered "+isUserCreated);
Google.getUserInfo();
}
}