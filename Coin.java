class Coin {

    Coin() {
        System.out.println("Default Coin constructor invoked");
    }

    Coin(int coinId, String name, String country, double value, String material, int year, boolean isRare) {
        System.out.println("Parameterized Coin constructor invoked");
        this.coinId = coinId;
        this.name = name;
        this.country = country;
        this.value = value;
        this.material = material;
        this.year = year;
        this.isRare = isRare;
    }
 int coinId;
    String name;
    String country;
    double value;
    String material;
    int year;
    boolean isRare;
	
    public void getCoinInfo() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Value: ₹" + value);
        System.out.println("Material: " + material);
        System.out.println("Year: " + year);
        System.out.println("Rare: " + isRare);
        System.out.println();
    }
}