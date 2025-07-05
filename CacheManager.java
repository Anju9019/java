class CacheManager {
    public static void main(String[] CacheManager) {
        System.out.println("Main Started");
        String cacheName = "Anjali";
        boolean clearAll = true;
        CacheHelper.clearCache(cacheName, clearAll);  
        System.out.println("Main Ended");
    }
}
