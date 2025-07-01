public class StockMarket {
       static  String[] stockNames = {"Tata Motors", "Infosys", "Reliance Industries", "HDFC Bank", "Wipro", "ICICI Bank", "Bharti Airtel", "L&T", "Asian Paints", "Adani Enterprises"};
 public static void main(String[] StockMarket ) {
        System.out.println("The number of stocks are: " + stockNames.length);
       // System.out.println("The stock names are: "   + stockNames[0] + ", " + stockNames[1] + ", " + stockNames[2] + ", "+ stockNames[3] + ", " + stockNames[4] + ", " + stockNames[5] + ", "+ stockNames[6] + ", " + stockNames[7] + ", " + stockNames[8] + ", " + stockNames[9]);//
    for(String stockNames : stockNames){
    System.out.println(stockNames);
    }
}
}