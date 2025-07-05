class DataBackup {
    public static void main(String args[]) {
        System.out.println("Main Started");
        String filePath = "/backu/anju";
        boolean includeMetadata = true;
        BackupHelper.backupData(filePath, includeMetadata);  
        System.out.println("Main Ended");
    }
}
