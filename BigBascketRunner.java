class BigBascketRunner{
public static void main(String anju[]){
String food="maggi";
double cost=BigBascket.search(food);
System.out.println("the food cost is"+cost);
int quantity=6;
double priceOfquantity=BigBascket.search( food,quantity);
System.out.println(" the priceOfQuantity  is "+food+"with price of "+cost+" and quantity is "+quantity );
}
}
