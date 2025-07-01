public class ChatShop {
      static  String[] chats = {"General Chat", "Tech Talk", "Gaming Zone", "Study Group", "Music Lounge", "Movie Reviews", "Fitness Tips", "Foodies", "Travel Diaries", "Book Club"};
  public static void main(String[]  ChatShop) {
        System.out.println("The number of chats are: " + chats.length);
        //System.out.println("The chats are: "  + chats[0] + ", " + chats[1] + ", " + chats[2] + ", "+ chats[3] + ", " + chats[4] + ", " + chats[5] + ", "+ chats[6] + ", " + chats[7] + ", " + chats[8] + ", " + chats[9]);//
         for (String chats : chats) {
         System.out.println(chats);
        }
}
}