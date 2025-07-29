class Blazer {

    Blazer() {
        System.out.println("Default Blazer constructor invoked");
    }

    Blazer(int blazerId, String size, String color, String material, String brand, double price, String gender) {
        System.out.println("Parameterized Blazer constructor invoked");
        this.blazerId = blazerId;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.gender = gender;
    }
	   int blazerId;
    String size;
    String color;
    String material;
    String brand;
    double price;
    String gender;


    public void getBlazerInfo() {
        System.out.println("Blazer ID: " + blazerId);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Can be worn by: " + gender);
    }
}
