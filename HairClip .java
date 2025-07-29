class HairClip {
    
    HairClip() {
        System.out.println("Default HairClip constructor invoked");
    }

    HairClip(int clipId, String material, String color, boolean isDecorated, double price, String clipType) {
        this.clipId = clipId;
        this.material = material;
        this.color = color;
        this.isDecorated = isDecorated;
        this.price = price;
        this.clipType = clipType;
    }
	public int clipId;
    public String material;
    public String color;
    public boolean isDecorated;
    public double price;
    public String clipType;


    void printHairClipInfo() {
        System.out.println("Clip ID: " + clipId);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Is Decorated: " + isDecorated);
        System.out.println("Price: ₹" + price);
        System.out.println("Clip Type: " + clipType);
        System.out.println();
    }
}
