class Weapon {

    Weapon() {
        System.out.println("Default Weapon constructor invoked");
    }

 
    Weapon(int weaponId, String name, String type, double weight,
           String material, double price, String usage) {
        this.weaponId = weaponId;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.material = material;
        this.price = price;
        this.usage = usage;
    }

  
    int weaponId;
    String name;
    String type;
    double weight;
    String material;
    double price;
    String usage;
	
    void printWeaponInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Usage: " + usage);
        System.out.println();
    }
}
