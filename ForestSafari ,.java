class ForestSafari {
    
    ForestSafari() {
        System.out.println("Default ForestSafari constructor invoked");
    }

    ForestSafari(int safariId, String forestName, String state, boolean hasTigerReserve, double ticketPrice, int maxVisitorsPerDay) {
        this.safariId = safariId;
        this.forestName = forestName;
        this.state = state;
        this.hasTigerReserve = hasTigerReserve;
        this.ticketPrice = ticketPrice;
        this.maxVisitorsPerDay = maxVisitorsPerDay;
    }

    public int safariId;
    public String forestName;
    public String state;
    public boolean hasTigerReserve;
    public double ticketPrice;
    public int maxVisitorsPerDay;

    void printSafariInfo() {
        System.out.println("Safari ID: " + safariId);
        System.out.println("Forest Name: " + forestName);
        System.out.println("State: " + state);
        System.out.println("Has Tiger Reserve: " + hasTigerReserve);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Max Visitors Per Day: " + maxVisitorsPerDay);
        System.out.println();
    }
}
