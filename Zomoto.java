class Zomoto{
public static  double search(String food){
double price=0.0;
if(food=="idli"){
price=20.56;
return price;
}
else if(food=="dosa"){
price=60.54;
return price;
}
else if(food=="samosa"){
price=45.89;
return price;
}
else if(food=="masala tea"){
price=54.90;
return price;
}
else if(food=="bajji"){
price=56.45;
return price;
}
else{
	System.out.println("food not found");
}
return price;
}

public static double search(String food,int quantity){
	double price=0.0;

if(food=="idli"){
price= quantity * 20.56;
return price;
}
else if(food=="dosa"){
price= quantity *60.54;
return price;
}
else if(food=="samosa"){
price=quantity *45.89;
return price;
}
else if(food=="masala tea"){
price=quantity*54.90;
return price;
}
else if(food=="bajji"){
price=quantity*56.45;
return price;
}
else{
	System.out.println("food not found");
}
return price;
}

}




