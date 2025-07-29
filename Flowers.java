class Flowers {
    Flowers() {
        System.out.println("Default Flowers constructor invoked");
    }


    Flowers(int flowerId, String flowerName, String color, boolean isFragrant, int averageHeightCm, double pricePerStem) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.color = color;
        this.isFragrant = isFragrant;
        this.averageHeightCm = averageHeightCm;
        this.pricePerStem = pricePerStem;
    }

    public int flowerId;
    public String flowerName;
    public String color;
    public boolean isFragrant;
    public int averageHeightCm;
    public double pricePerStem; // in INR

    void printFlowerInfo() {
        System.out.println("Flower ID: " + flowerId);
        System.out.println("Flower Name: " + flowerName);
        System.out.println("Color: " + color);
        System.out.println("Is Fragrant: " + isFragrant);
        System.out.println("Average Height (cm): " + averageHeightCm);
        System.out.println("Price per Stem (INR): " + pricePerStem);
        System.out.println();
    }
}
