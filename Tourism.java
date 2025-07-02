public class Tourism {
static String mysorePalace = "Mysore Palace";
    static String hampi   = "Hampi";
    static String coorg       = "Coorg";
    static String gokarna  = "Gokarna";
    static String chikmagalur = "Chikmagalur";
    static String badamiCaves = "Badami Caves";
    static String jogFalls    = "Jog Falls";
    static String nandiHills  = "Nandi Hills";
    static String belur  = "Belur";
    static String halebidu = "Halebidu";
    static String kabini  = "Kabini";
    static String bandipurNationalPark = "Bandipur National Park";
    static String shravanabelagola = "Shravanabelagola";
    static String bijapur = "Bijapur";
    static String dandeli     = "Dandeli";
	    static String mysorepalace ="Mysore Palace";
		static String hampi="Hampi";
		static String coorg="Coorg";
       static  String[] touristPlaces = { "mysorepalace", " hampi", "coorg", "Gokarna", "Chikmagalur",  "Badami Caves", "Jog Falls", "Nandi Hills", "Belur", "Halebidu", "Kabini", "Bandipur National Park", "Shravanabelagola", "Bijapur", "Dandeli" };
    public static void main(String[]  Tourism) {
        System.out.println("The number of tourist places are: " + touristPlaces.length);
		
		String mysorePalace= "Mysore Palace";
String hampi   = "Hampi";
String coorg = "Coorg";
String gokarna   = "Gokarna";
String chikmagalur   = "Chikmagalur";
String badamiCaves   = "Badami Caves";
String jogFalls      = "Jog Falls";
String nandiHills    = "Nandi Hills";
String belur    = "Belur";
String halebidu    = "Halebidu";
String kabini   = "Kabini";
String bandipurNationalPark   = "Bandipur National Park";
String shravanabelagola = "Shravanabelagola";
String bijapur= "Bijapur";
String dandeli    = "Dandeli";

String[] touristPlaces = {
    mysorePalace, hampi, coorg, gokarna, chikmagalur, badamiCaves, jogFalls, nandiHills,
    belur, halebidu, kabini, bandipurNationalPark, shravanabelagola, bijapur, dandeli
};

       // System.out.println("The tourist places are: " + touristPlaces[0] + ", " + touristPlaces[1] + ", " + touristPlaces[2] + ", " + touristPlaces[3] + ", " + touristPlaces[4] + ", " + touristPlaces[5] + ", "+ touristPlaces[6] + ", " + touristPlaces[7] + ", " + touristPlaces[8] + ", " + touristPlaces[9] + ", "+ touristPlaces[10] + ", " + touristPlaces[11] + ", " + touristPlaces[12] + ", " + touristPlaces[13] + ", " + touristPlaces[14]);//
         for (String touristPlaces : touristPlaces) {
         System.out.println(touristPlaces);
        }
}
}