public class SpiceShop {
     static   String[] spices = { "Turmeric", "Cumin", "Coriander", "Cardamom", "Clove", "Cinnamon", "Black Pepper", "Mustard Seeds", "Fennel Seeds", "Fenugreek","Bay Leaf", "Saffron", "Ginger", "Garlic" };
        public static void main(String[] SpiceShop ) {  
        System.out.println("The name of spices are: " + spices.length);
       // System.out.println("The spices are: "  + spices[0] + ", " + spices[1] + ", " + spices[2] + ", " + spices[3] + ", " + spices[4] + ", " + spices[5] + ", "+ spices[6] + ", " + spices[7] + ", " + spices[8] + ", " + spices[9] + ", "+ spices[10] + ", " + spices[11] + ", " + spices[12] + ", " + spices[13]);//
    for (String spice  :spices) {
         System.out.println(spice);
        }
}
}