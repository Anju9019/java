class GiTag {

    public GiTag() {
        System.out.println("Default GiTag constructor invoked");
    }

    public GiTag(int giId, String productName, String originPlace, int yearGranted, String productCategory, boolean isExported) {
        this.giId = giId;
        this.productName = productName;
        this.originPlace = originPlace;
        this.yearGranted = yearGranted;
        this.productCategory = productCategory;
        this.isExported = isExported;
    }

    public int giId;
    public String productName;
    public String originPlace;
    public int yearGranted;
    public String productCategory;
    public boolean isExported;

    public void printGiTagInfo() {
        System.out.println("GI ID: " + giId);
        System.out.println("Product Name: " + productName);
        System.out.println("Origin Place: " + originPlace);
        System.out.println("Year Granted: " + yearGranted);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Is Exported: " + isExported);
        System.out.println();
    }
}
