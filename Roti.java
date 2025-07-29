class Roti {

    Roti() {
        System.out.println("Default Roti constructor invoked");
    }

    Roti(int rotiId, String type, double diameterCm, int calories, boolean isWholeWheat, double pricePerPiece) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        this.calories = calories;
        this.isWholeWheat = isWholeWheat;
        this.pricePerPiece = pricePerPiece;
    }
     int rotiId;
    String type;
    double diameterCm;
    int calories;
   boolean isWholeWheat;
   double pricePerPiece;

 
    void printRotiInfo() {
        System.out.println("Roti ID: " + rotiId);
        System.out.println("Type: " + type);
        System.out.println("Diameter (cm): " + diameterCm);
        System.out.println("Calories: " + calories);
        System.out.println("Is Whole Wheat: " + (isWholeWheat ? "Yes" : "No"));
        System.out.println("Price Per Piece: " + pricePerPiece);
        System.out.println();
    }
}
