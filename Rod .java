class Rod {


    Rod() {
        System.out.println("Default Rod constructor invoked");
    }

    Rod(int rodId, String length, String material, String brand, double price, String useType) {
        this.rodId = rodId;
        this.length = length;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.useType = useType;
    }
    int rodId;
    String length;
    String material;
    String brand;
    double price;
    String useType;
	
    void printRodInfo() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Length: " + length);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Use Type: " + useType);
        System.out.println();
    }
}
