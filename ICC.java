class ICC{
static String india="India";
static String bangadesh ="Bangladesh";
static String pakistan ="Pakistan";
static String newZealand ="New Zealand";
static String afghanistan= "Afghanistan";
static String england  ="England";
static String australia="Australia";
static String southAfrica="SouthAfrica";

 static  String[] iccNames = {india, bangadesh, pakistan,newZealand, afghanistan, england, australia,southAfrica};

public static void main (String  []iccName )
{

 System.out.println(iccNames[0] + ", " + iccNames[1] + ", " + iccNames[2] + ", "+ iccNames[3] + ", " + iccNames[4] + ", " + iccNames[5] + ", "+ iccNames[6] + ", " +iccNames[7]);//
String india  = "India";
String bangladesh   = "Bangladesh";
String pakistan = "Pakistan";
String newZealand   = "New Zealand";
String afghanistan  = "Afghanistan";
String england  = "England";
String australia = "Australia";
String southAfrica  = "SouthAfrica";

 for(String iccName :iccNames){
    System.out.println(iccName);
}
}
