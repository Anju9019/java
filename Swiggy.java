class Swiggy{
public static double search(String food){
double price=0.0;
if(food=="dosa"){
price=91;
return price;
}
else if(food=="idli"){
price=45;
return price;
}
else if(food=="vada"){
price=54;
return price;
}
else if(food=="coffee"){
price=56;
return price;
}
else{
	System.out.println("food not found");
}
return price;
}

public static double search(String food,int quantity){
	double price=0.0;
if(food=="dosa"){
price = quantity*35.04;
return price;
}else if(food=="idli"){
price = quantity*45.01;
return price;
}else if(food=="vada"){
price = quantity*30.00;
return price;
}else if(food=="coffee"){
price = quantity*40.03;
return price;
}
else{
	System.out.println("food not found");
}
return price;
}

}


