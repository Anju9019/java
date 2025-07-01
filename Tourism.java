public class Tourism {
	    static String mysorepalace ="Mysore Palace";
		static String hampi="Hampi";
		static String coorg="Coorg";
       static  String[] touristPlaces = { "mysorepalace", " hampi", "coorg", "Gokarna", "Chikmagalur",  "Badami Caves", "Jog Falls", "Nandi Hills", "Belur", "Halebidu", "Kabini", "Bandipur National Park", "Shravanabelagola", "Bijapur", "Dandeli" };
    public static void main(String[]  Tourism) {
        System.out.println("The number of tourist places are: " + touristPlaces.length);
       // System.out.println("The tourist places are: " + touristPlaces[0] + ", " + touristPlaces[1] + ", " + touristPlaces[2] + ", " + touristPlaces[3] + ", " + touristPlaces[4] + ", " + touristPlaces[5] + ", "+ touristPlaces[6] + ", " + touristPlaces[7] + ", " + touristPlaces[8] + ", " + touristPlaces[9] + ", "+ touristPlaces[10] + ", " + touristPlaces[11] + ", " + touristPlaces[12] + ", " + touristPlaces[13] + ", " + touristPlaces[14]);//
         for (String touristPlaces : touristPlaces) {
         System.out.println(touristPlaces);
        }
}
}