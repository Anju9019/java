class Blade {
   
    Blade() {
        System.out.println("Blade default constructor invoked");
    }

    Blade(int bladeId, String size, String color, String material, String brand, double price, String gender) {
        System.out.println("Blade parameterized constructor invoked");
        this.bladeId = bladeId;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.gender = gender;
    }
	 
    int bladeId;
    String size;
    String color;
    String material;
    String brand;
    double price;
    String gender;
	
    public void getBladeInfo() {
        System.out.println("Blade ID: " + bladeId);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("For Gender: " + gender);
    
    }
}
