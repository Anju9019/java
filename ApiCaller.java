class ApiCaller {
    public static void main(String[] ApiCaller) {
        System.out.println("Main Started");
        String endpoint = "data";
        int timeoutSeconds = 10;
        ApiHelper.callApi(endpoint, timeoutSeconds);  
        System.out.println("Main Ended");
    }
}
