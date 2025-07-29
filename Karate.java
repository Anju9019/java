 class Karate {

    public Karate() {
        System.out.println("Default Karate constructor invoked");
    }

    public Karate(int beltRank, String style, int yearsOfPractice, boolean hasBlackBelt, String instructorName, double trainingHoursPerWeek) {
        this.beltRank = beltRank;
        this.style = style;
        this.yearsOfPractice = yearsOfPractice;
        this.hasBlackBelt = hasBlackBelt;
        this.instructorName = instructorName;
        this.trainingHoursPerWeek = trainingHoursPerWeek;
    }

    public int beltRank;
    public String style;
    public int yearsOfPractice;
    public boolean hasBlackBelt;
    public String instructorName;
    public double trainingHoursPerWeek;

    public void getInfo() {
        System.out.println("Belt Rank: " + beltRank);
        System.out.println("Style: " + style);
        System.out.println("Years of Practice: " + yearsOfPractice);
        System.out.println("Has Black Belt: " + hasBlackBelt);
        System.out.println("Instructor Name: " + instructorName);
        System.out.println("Training Hours Per Week: " + trainingHoursPerWeek);
        System.out.println();
    }
}
