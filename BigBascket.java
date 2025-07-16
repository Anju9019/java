class BigBascket{
public static double search(String food)
{
double price=0.0;
if (food=="maggi"){
price=45.67;
return price;
}
else if(food=="rava idli"){
price=56.54;
return price;
}
else if(food=="sevpoori"){
price=53.88;
return price;
}
else if(food=="vadapav"){
price=70.00;
return price;
}
else{
System.out.println("food not found");
}
return price;
}
public static double search(String food,int quantity){
	double price=0.0;

if(food=="maggi"){
price= quantity * 20.56;
return price;
}
else if(food=="rava idli"){
price= quantity *60.54;
return price;
}
else if(food=="sevpoori"){
price=quantity *45.89;
return price;
}
else if(food=="masala tea"){
price=quantity*54.90;
return price;
}
else if(food=="vadapav"){
price=quantity*56.45;
return price;
}
else{
	System.out.println("food not found");
}
return price;
}

}