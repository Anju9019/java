 class Speaker {

static int minVolume;
static int currentVolume;
static boolean isConnected;
   static int maxVolume = 7;
	  
 public static void onOrOff(){
	if(isConnected == false ){
		isConnected	= true; 
	 System.out.println("speaker is turned on!");
	}
		else {
		isConnected = false; 
		System.out.println("speaker is turned off");
		}

	}
 public static void increaseVolume(){

System.out.println("increaseVolume");
if(isConnected == true){
	if(currentVolume < maxVolume){
		currentVolume = currentVolume+1;
		System.out.println("currentVolume is "+ currentVolume);
	}
	else{
		System.out.println("max volume reached ");
	}
}
else{

	System.out.println("speaker is turned off  gubee on madu speaker naaaa");
}


}
 public static void decreaseVolume(){

System.out.println("decreaseVolume");
if(isConnected == true){
	if(currentVolume == maxVolume){
		currentVolume--;
		System.out.println("currentVolume is "+ currentVolume);
	}
	else{
		System.out.println("max volume reached ");
	}
}
else{

	System.out.println("speaker is turned off!  gubee on madu speaker naaaa");
}


}
}