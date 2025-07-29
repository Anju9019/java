class Jwellery {
    Jwellery() {
        System.out.println("Default Jwellery constructor invoked");
    }


    Jwellery(int jwelleryId, String type, String material, String color, String brand, double price, String suitableFor) {
        this.jwelleryId = jwelleryId;
        this.type = type;
        this.material = material;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.suitableFor = suitableFor;
    }

 int jwelleryId;
    String type;
    String material;
    String color;
    String brand;
    double price;
    String suitableFor;
    void printJwelleryInfo() {
        System.out.println("Jwellery ID: " + jwelleryId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Suitable For: " + suitableFor);
        System.out.println();
    }
}
