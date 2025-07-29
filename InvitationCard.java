class InvitationCard {
    
    InvitationCard() {
        System.out.println("Default InvitationCard constructor invoked");
    }
    InvitationCard(int cardId, String occasion, String recipientName, String senderName, 
                   String date, String venue, String designTheme, double price) {
        this.cardId = cardId;
        this.occasion = occasion;
        this.recipientName = recipientName;
        this.senderName = senderName;
        this.date = date;
        this.venue = venue;
        this.designTheme = designTheme;
        this.price = price;
    }
int cardId;
    String occasion;
    String recipientName;
    String senderName;
    String date;
    String venue;
    String designTheme;
    double price;

   
    void printCardInfo() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Occasion: " + occasion);
        System.out.println("Recipient Name: " + recipientName);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Date: " + date);
        System.out.println("Venue: " + venue);
        System.out.println("Design Theme: " + designTheme);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
