 class Politician {

    Politician() {
        System.out.println("Default Politician constructor invoked");
    }
    Politician(int politicianId, String name, String party, String state, int age, String position, double netWorth) {
        this.politicianId = politicianId;
        this.name = name;
        this.party = party;
        this.state = state;
        this.age = age;
        this.position = position;
        this.netWorth = netWorth;
    }
	
    int politicianId;
    String name;
    String party;
    String state;
    int age;
    String position;
    double netWorth;

    void printPoliticianInfo() {
        System.out.println("Politician ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("State: " + state);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Net Worth: " + netWorth);
        System.out.println();
    }
}
