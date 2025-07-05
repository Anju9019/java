class InventoryManager {
    public static void main(String inventory[]) {
        System.out.println("Main Started");
String productName = "Desk";
 int quantity = 76;
        InventoryHelper.updateInventory(productName, quantity);  
        System.out.println("Main Ended");
    }
}
