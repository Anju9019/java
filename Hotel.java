public class Bar {
       static  String[] alcoholNames = {"Whiskey","Vodka", "Rum","Gin", "MH","Brandy","Beer", "Wine","Absinthe", "Cognac", "Sake", "BlackWhite"};
public static void main(String[] Bar) {
  System.out.println("The number of alcohol names are: " + alcoholNames.length);
 //System.out.println("The alcohol names are: " + alcoholNames[0] + ", " + alcoholNames[1] + ", " + alcoholNames[2] + ", "+ alcoholNames[9] + ", " + alcoholNames[10] + ", " + alcoholNames[11]);//
	
	 for (String alcoholName : alcoholNames) {
         System.out.println(alcoholName);
        }
}
}