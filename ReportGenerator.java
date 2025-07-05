class ReportGenerator {
    public static void main(String Report[]) {
        System.out.println("Main Started");
      String reportType = "Sales";
    int year = 2025;
ReportHelper.generateReport(reportType, year);  
        System.out.println("Main Ended");
    }
}
