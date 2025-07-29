class Marble {
  
    public Marble() {
        System.out.println("Default Marble constructor invoked");
    }

    // Parameterized constructor
    public Marble(int marbleId, String color, double diameterCm, String material, boolean isCollectorItem) {
        this.marbleId = marbleId;
        this.color = color;
        this.diameterCm = diameterCm;
        this.material = material;
        this.isCollectorItem = isCollectorItem;
    } 
	 int marbleId;
 String color;
  double diameterCm
  String material;        
    public boolean isCollectorItem;

  
    public void printMarbleInfo() {
        System.out.println("Marble ID: " + marbleId);
        System.out.println("Color: " + color);
        System.out.println("Diameter (cm): " + diameterCm);
        System.out.println("Material: " + material);
        System.out.println("Collector Item: " + isCollectorItem);
        System.out.println();
    }
}
