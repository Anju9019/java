class Hat {

    Hat() {
        System.out.println("Default Hat constructor invoked");
    }

    Hat(int hatId, String style, String color, String material, double price, boolean isUnisex) {
		System.out.println("The Hat Constructor is invoked");
        this.hatId = hatId;
        this.style = style;
        this.color = color;
        this.material = material;
        this.price = price;
        this.isUnisex = isUnisex;
    }
    int hatId;
    String style;
    String color;
    String material;
    double price;
    boolean isUnisex;
    public void printHatInfo() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Style: " + style);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Is Unisex: " + isUnisex);
        System.out.println();
    }
}
