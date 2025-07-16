class SwiggyRunner{
public static void main(String anju[]){
String food="dosa";
double cost =Swiggy.search(food);
System.out.println("the food name is"+cost);

int quantity=3;
double priceOfquantity=Swiggy.search( food,quantity);
System.out.println(" the priceOfQuantity  is "+food+"with price of "+cost+" and quantity is "+quantity );
}
}






