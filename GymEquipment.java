class GymEquipment {

     GymEquipment() {
        System.out.println("Default GymEquipment constructor invoked");
    }

    public GymEquipment(int equipmentId, String name, String type, String material, String brand, double price, String suitableFor) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.type = type;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.suitableFor = suitableFor;
    }

    public int equipmentId;
    public String name;
    public String type;
    public String material;
    public String brand;
    public double price;
    public String suitableFor;

    public void printEquipmentInfo() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Suitable For: " + suitableFor);
        System.out.println();
    }
}
