public class CityPinCodes {
      static  String[] pinCodes = {"560001",  "110001",  "400001",  "600001",  "700001",  "500001", "380001", "302001", "751001", "682001", "144001", "482001", "313001" };
		 public static void main(String[] CityPinCodes) {
        System.out.println("The number of pin codes are: " + pinCodes.length);
		
		 System.out.println("The city pin codes are: "+ pinCodes[0] + "  " + pinCodes[1] + "  " + pinCodes[2] + " "+ pinCodes[3] + "  " + pinCodes[4] + " " + pinCodes[5] + "  "+ pinCodes[6] + " " + pinCodes[7] + " " + pinCodes[8] + " " + pinCodes[9] + " " + pinCodes[10] + " " + pinCodes[11] + " " + pinCodes[12]);//
    
	  for (String pinCode  :pinCodes) {
         System.out.println(pinCode);
        }
}
}