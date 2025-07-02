public class ChatShop {
static String generalChat ="General Chat";
static String  techTalk="Tech Talk";
static String gamingZone="Gaming Zone";
static String studyGroup="Study Group";
static String musicLounge="Music Lounge";
static String fitnessTips="Fitness Tips";
static String foodies="Foodies";
static String travelDiaries="Travel Diaries";
static String bookClub="Book Club";
static String movieReviews="Movie Reviews";
      static  String[] chats = {"General Chat", "Tech Talk", "Gaming Zone", "Study Group", "Music Lounge", "Movie Reviews", "Fitness Tips", "Foodies", "Travel Diaries", "Book Club"};
  public static void main(String[]  ChatShop) {
        System.out.println("The number of chats are: " + chats.length);
		 String generalChat ="General Chat";
 String  techTalk="Tech Talk";
 String gamingZone="Gaming Zone";
 String studyGroup="Study Group";
 String musicLounge="Music Lounge";
 String fitnessTips="Fitness Tips";
 String foodies="Foodies";
 String travelDiaries="Travel Diaries";
 String bookClub="Book Club";
	
        //System.out.println("The chats are: "  + chats[0] + ", " + chats[1] + ", " + chats[2] + ", "+ chats[3] + ", " + chats[4] + ", " + chats[5] + ", "+ chats[6] + ", " + chats[7] + ", " + chats[8] + ", " + chats[9]);//
         for (String chats : chats) {
         System.out.println(chats);
        }
}
}