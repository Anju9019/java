
class DataExporter {
    public static void main(String[] DataExporter) {
        System.out.println("Main Started");
        String format = "CSV";
        int batchSize = 500;
        ExportHelper.exportData(format, batchSize);  
        System.out.println("Main Ended");
    }
}
