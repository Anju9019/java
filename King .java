class King {
    King() {
        System.out.println("Default King constructor invoked");
    }

    King(int kingId, String kingName, String kingdom, int reignStartYear, int reignEndYear, boolean isFamous) {
        this.kingId = kingId;
        this.kingName = kingName;
        this.kingdom = kingdom;
        this.reignStartYear = reignStartYear;
        this.reignEndYear = reignEndYear;
        this.isFamous = isFamous;
    }
	 public int kingId;
    public String kingName;
    public String kingdom;
    public int reignStartYear;  // can be negative for BC years
    public int reignEndYear;
    public boolean isFamous;
    void printKingInfo() {
        System.out.println("King ID: " + kingId);
        System.out.println("King Name: " + kingName);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Start Year: " + reignStartYear);
        System.out.println("Reign End Year: " + reignEndYear);
        System.out.println("Is Famous: " + isFamous);
        System.out.println();
    }
}
