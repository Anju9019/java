public class JuiceShop {
	static  String orangeJuice="OrangeJuice";
     static  String[] juices = { "orangejuice", "Apple Juice", "Grape Juice", "Pineapple Juice", "Watermelon Juice","Mango Juice", "Lime Juice", "Pomegranate Juice", "Guava Juice", "Papaya Juice", "Strawberry Juice", "Blueberry Juice", "Carrot Juice", "Beetroot Juice", "Sweet Lime Juice" };
      public static void main(String[] juiceShop) {
		  String Orangejuice = "OrangeJuice";
	  System.out.println("The number of juices are: " + juices.length);
	 // System.out.println("The juices are: "   + juices[0] + ", " + juices[1] + ", " + juices[2] + ", " + juices[3] + ", " + juices[4] + ", " + juices[5] + ", " + juices[6] + ", " + juices[7] + ", " + juices[8] + ", " + juices[9] + ", "+ juices[10] + ", " + juices[11] + ", " + juices[12] + ", " + juices[13] + ", " + juices[14]);//    }
 for(String juice :juices){
    System.out.println(juice);
    }
}
}